/**
 * Copyright 2012 Emmanuel Bourg
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.pushingpixels.flamingo.api.svg.transcoders;

import java.awt.geom.RoundRectangle2D;
import java.io.PrintWriter;

/**
 * Transcodes a round rectangle.
 *
 * @author Emmanuel Bourg
 * @version $Revision$, $Date$
 */
public class RoundRectangleTranscoder extends Transcoder<RoundRectangle2D> {

    public static RoundRectangleTranscoder INSTANCE = new RoundRectangleTranscoder();

    @Override
    public void transcode(RoundRectangle2D rect, PrintWriter output) {
        DoubleTranscoder transcoder = DoubleTranscoder.INSTANCE;
        output.println("shape = new RoundRectangle2D.Double("
                + transcoder.transcode(rect.getX()) + ", "
                + transcoder.transcode(rect.getY()) + ", "
                + transcoder.transcode(rect.getWidth()) + ", "
                + transcoder.transcode(rect.getHeight()) + ", "
                + transcoder.transcode(rect.getArcWidth()) + ", "
                + transcoder.transcode(rect.getArcHeight()) + ");");
    }
}
