/*******************************************************************************
 * Copyright (c) 2010 Matthew J. Dovey (www.ceridwen.com).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Public License v3.0
 * which accompanies this distribution, and is available at 
 * <http://www.gnu.org/licenses/>
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 * 
 * Contributors:
 *     Matthew J. Dovey (www.ceridwen.com) - initial API and implementation
 ******************************************************************************/
package com.ceridwen.circulation.SIP.messages;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;

import com.ceridwen.circulation.SIP.types.descriptors.PositionedFieldDescriptor;
import com.ceridwen.circulation.SIP.types.descriptors.TaggedFieldDescriptor;

/**
 * <p>Title: </p> <p>Description: </p> <p>Copyright: Copyright (c) 2003</p>
 * <p>Company: </p>
 * 
 * @author not attributable
 * @version 1.0
 */

public class PatronEnableBeanInfo extends MessageBeanInfo {
    Class<PatronEnable> beanClass = PatronEnable.class;

    public PatronEnableBeanInfo() {
    }

    @Override
    public PropertyDescriptor[] getPropertyDescriptorsInternal() throws IntrospectionException {
        PropertyDescriptor _transactionDate = new PropertyDescriptor("transactionDate", this.beanClass, "getTransactionDate", "setTransactionDate");
        PropertyDescriptor _institutionId = new PropertyDescriptor("institutionId", this.beanClass, "getInstitutionId", "setInstitutionId");
        PropertyDescriptor _patronIdentifier = new PropertyDescriptor("patronIdentifier", this.beanClass, "getPatronIdentifier", "setPatronIdentifier");
        PropertyDescriptor _terminalPassword = new PropertyDescriptor("terminalPassword", this.beanClass, "getTerminalPassword", "setTerminalPassword");
        PropertyDescriptor _patronPassword = new PropertyDescriptor("patronPassword", this.beanClass, "getPatronPassword", "setPatronPassword");

        _transactionDate.setValue("SIPFieldDescriptor", new PositionedFieldDescriptor(2, 19));

        _patronIdentifier.setValue("SIPFieldDescriptor", new TaggedFieldDescriptor(true));
        _patronPassword.setValue("SIPFieldDescriptor", new TaggedFieldDescriptor(false));
        _terminalPassword.setValue("SIPFieldDescriptor", new TaggedFieldDescriptor(false));

        PropertyDescriptor[] pds = new PropertyDescriptor[] {
                _transactionDate,
                _institutionId,
                _patronIdentifier,
                _terminalPassword,
                _patronPassword };
        return pds;
    }
}
