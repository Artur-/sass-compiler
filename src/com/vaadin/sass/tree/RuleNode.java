/*
 * Copyright 2011 Vaadin Ltd.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.vaadin.sass.tree;

import org.w3c.css.sac.LexicalUnit;

public class RuleNode extends Node {
    private static final long serialVersionUID = 6653493127869037022L;

    String variable;
    LexicalUnit value;
    String comment;
    private boolean important;

    public RuleNode(String variable, LexicalUnit value, boolean important,
            String comment) {
        this.variable = variable;
        this.value = value;
        this.important = important;
        this.comment = comment;
    }

    public String getVariable() {
        return variable;
    }

    public void setVariable(String variable) {
        this.variable = variable;
    }

    public LexicalUnit getValue() {
        return value;
    }

    public void setValue(LexicalUnit value) {
        this.value = value;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(variable).append(": ").append(value.toString());
        builder.append(important ? " !important;" : ";");
        if (comment != null) {
            builder.append(comment);
        }
        return builder.toString();
    }

    public boolean isImportant() {
        return important;
    }

    public void setImportant(boolean important) {
        this.important = important;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

}
