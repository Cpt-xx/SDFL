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

/**
 * Delete statement in SDFL
 * @author Sylvain Cloutier
 */
public class DeleteFromStatement extends Statement {
	private ConditionGroup conditionGroup;
	private String tableName;
	
	public ConditionGroup getConditionGroup() {
		return conditionGroup;
	}

	public void setConditionGroup(ConditionGroup conditionGroup) {
		this.conditionGroup = conditionGroup;
	}

	public String getTableName() {
		return this.tableName;
	}

	public void setTableName(String pTableName) {
		this.tableName = pTableName;
	}
	
	
}
