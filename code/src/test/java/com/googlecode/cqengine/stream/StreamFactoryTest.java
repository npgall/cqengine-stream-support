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

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Unit tests for {@link StreamFactory}.
 *
 * @author Niall Gallagher
 */
public class StreamFactoryTest {

    @Test
    public void testStreamOf() {
        List<Integer> input = Arrays.asList(1, 2, 3);
        Stream<Integer> stream = StreamFactory.streamOf(input);
        List<Integer> output = stream.collect(Collectors.toList());
        Assert.assertEquals(input, output);
    }

    @Test
    public void testPrivateConstructor() {
        Assert.assertNotNull(new StreamFactory());
    }
}