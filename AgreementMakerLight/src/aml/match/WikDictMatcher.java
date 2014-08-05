/******************************************************************************
 * Copyright 2013-2014 LASIGE                                                  *
 *                                                                             *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may     *
 * not use this file except in compliance with the License. You may obtain a   *
 * copy of the License at http://www.apache.org/licenses/LICENSE-2.0           *
 *                                                                             *
 * Unless required by applicable law or agreed to in writing, software         *
 * distributed under the License is distributed on an "AS IS" BASIS,           *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.    *
 * See the License for the specific language governing permissions and         *
 * limitations under the License.                                              *
 *                                                                             *
 *******************************************************************************
 * Matches Ontologies by finding literal full-name matches between their       *
 * Lexicons after extension with the WordNet.                                  *
 *                                                                             *
 * @author Ricardo F. Guimarães                                                *
 * @date 05-08-2014                                                            *
 * @version 0.1                                                                *
 ******************************************************************************/

package aml.match;

import aml.util.Dictionary;

/**
 * Created by rickfg on 8/5/14.
 */
public class WikDictMatcher implements PrimaryMatcher, LexiconExtender {

    private final String PATH = "store/knowledge/dictionary/";
    // The type of lexical entry generated by this LexiconExtender
    private final String TYPE = "externalMatch";
    // The source of this LexiconExtender
    private final String SOURCE = "English Wiktionary (wik2dict)";
    // The confidence score of the English Wiktionary
    private final double CONFIDENCE = 0.7;

    public WikDictMatcher() {

        // Setup the wik2dict output file location
        long time = System.currentTimeMillis() / 1000;
        Dictionary wik = new Dictionary(PATH, "English.txt");
        time = System.currentTimeMillis() / 1000 - time;
        System.out.println("Dictionary loaded in " + time + " seconds");
    }

    @Override
    public Alignment match(double thresh) {
        return null;
    }

    @Override
    public void extendLexicons(double thresh) {

    }
}
