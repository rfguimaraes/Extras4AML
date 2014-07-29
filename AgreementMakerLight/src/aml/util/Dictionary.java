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
 * Dictionary of translations obtain from the English Wiktionary, using        *
 * wik2dict                                                                    *
 *                                                                             *
 * @authors Ricardo F. Guimarães                                               *
 * @date 29-07-2014                                                            *
 * @version 0.2                                                                *
 ******************************************************************************/

package aml.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;

import org.semanticweb.elk.util.collections.Pair;

import edu.smu.tspell.wordnet.WordNetDatabase;

public class Dictionary {
    // The dictionary produced by wik2dict
    HashMap<Pair<String, String>, DictionaryWord> dictionary;
    // The path to the WordNet database
    private final String PATH = "store/knowledge/dictionary/";
    // The type of lexical entry generated by this LexiconExtender
    private final String TYPE = "externalMatch";
    // The source of this LexiconExtender
    private final String SOURCE = "English Wiktionary (wik2dict)";
    // The confidence score of the English Wiktionary
    private final double CONFIDENCE = 0.7;
    
    public Dictionary() {
        //Setup the wordnet database directory
        String path = new File(PATH).getAbsolutePath();
        System.setProperty("dictionary.dir", path);
        dictionary = new HashMap<Pair<String,String>, DictionaryWord>();
        FileReader file = null;
        try {
            file = new FileReader(path + "English.txt");
            BufferedReader reader = new BufferedReader(file);
            String line = "";
            while ((line = reader.readLine()) != null) {
            }
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}