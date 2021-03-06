/**
 * This file is part of the Simple Data Fix Language (SDFL) core.
 * 
 * All components of the language (compiler, interpreter, etc.) are
 * free and open source: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * SDFL is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with SDFL.  If not, see <http://www.gnu.org/licenses/>.
 * 
 * @author Sylvain Cloutier
 */
package com.sdfl.statements.impl;

import com.sdfl.statements.Statement;
import com.sdfl.statements.conditions.ConditionGroup;
import com.sdfl.statements.template.UsingTemplateStatement;

/**
 * Object representation of the "insert into" statement.
 * @author Sylvain Cloutier
 */
public class InsertIntoStatement extends Statement {
	private ConditionGroup condition;
	private UsingTemplateStatement template;
	private String tableName;
	
	public InsertIntoStatement() {
		this.template = new UsingTemplateStatement();
		this.condition = new ConditionGroup();
	}

	public UsingTemplateStatement getTemplate() {
		return template;
	}

	public void setTemplate(UsingTemplateStatement pTemplate) {
		this.template = pTemplate;
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String pTableName) {
		this.tableName = pTableName;
	}

	public ConditionGroup getConditionGroup() {
		return this.condition;
	}

	public void setConditionGroup(ConditionGroup pConditionGroup) {
		this.condition = pConditionGroup;
	}
	
}
