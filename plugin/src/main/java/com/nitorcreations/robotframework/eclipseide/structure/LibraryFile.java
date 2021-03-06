/**
 * Copyright 2012 Nitor Creations Oy
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
package com.nitorcreations.robotframework.eclipseide.structure;

import java.util.Collections;
import java.util.List;

import com.nitorcreations.robotframework.eclipseide.structure.api.IDynamicParsedKeywordString;
import com.nitorcreations.robotframework.eclipseide.structure.api.IDynamicParsedString;
import com.nitorcreations.robotframework.eclipseide.structure.api.ILibraryFile;

public class LibraryFile implements ILibraryFile {

    private IDynamicParsedKeywordString realName;
    private IDynamicParsedKeywordString customName;
    private List<IDynamicParsedString> argumentsIMM;

    // single

    public void setRealName(IDynamicParsedKeywordString realName) {
        this.realName = realName;
    }

    public void setCustomName(IDynamicParsedKeywordString customName) {
        this.customName = customName;
    }

    // lists

    public void setArguments(List<? extends IDynamicParsedString> arguments) {
        this.argumentsIMM = Collections.unmodifiableList(arguments);
    }

    // interface-specified getters

    @Override
    public IDynamicParsedKeywordString getRealName() {
        return realName;
    }

    @Override
    public IDynamicParsedKeywordString getCustomName() {
        return customName;
    }

    @Override
    public List<IDynamicParsedString> getArguments() {
        return argumentsIMM;
    }

}
