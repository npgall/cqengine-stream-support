/**
 * Copyright 2012-2016 Niall Gallagher
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.googlecode.cqengine.stream;

import java.util.stream.Stream;
import java.util.stream.StreamSupport;

/**
 * A static factory for converting {@link Iterable}s into Java 8 {@link Stream}s.
 * <p/>
 * This is primarily for use with CQEngine {@code ResultSet}s, as a means to allow CQEngine to retain compatibility
 * with Java 6, while it may be used with this library which works with Java 8.
 *
 * @author Niall Gallagher
 */
@SuppressWarnings("WeakerAccess")
public class StreamFactory {

    /**
     * Converts the given {@link Iterable} into a sequential {@link Stream}.
     *
     * @param iterable The {@code Iterable} to convert
     * @return A sequential {@code Stream} of the objects returned by the {@code Iterable}
     */
    public static <O> Stream<O> streamOf(Iterable<O> iterable) {
        return StreamSupport.stream(iterable.spliterator(), false);
    }

    /**
     * Private constructor, unused.
     */
    StreamFactory() {
    }
}
