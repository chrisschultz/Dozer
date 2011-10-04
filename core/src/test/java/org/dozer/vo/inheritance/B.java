/*
 * Copyright 2005-2010 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.dozer.vo.inheritance;

public class B extends SuperB {
  private String field1;
  private String fieldB;

  public String getField1() {
    return field1;
  }
  public void setField1(String field1) {
    this.field1 = field1;
  }
  public String getFieldB() {
    return fieldB;
  }
  public void setFieldB(String fieldB) {
    this.fieldB = fieldB;
  }

}
