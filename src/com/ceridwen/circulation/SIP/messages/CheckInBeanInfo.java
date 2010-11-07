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
/**
 * <p>Title: Self Issue</p>
 * <p>Description: Self Issue Client</p>
 * <p>Copyright: 2004,</p>
 * <p>Company: ceridwen.com</p>
 * @author Matthew J. Dovey
 * @version 2.1
 */

package com.ceridwen.circulation.SIP.messages;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;

import com.ceridwen.circulation.SIP.types.descriptors.PositionedFieldDescriptor;
import com.ceridwen.circulation.SIP.types.descriptors.TaggedFieldDescriptor;

public class CheckInBeanInfo extends MessageBeanInfo {
    Class<CheckIn> beanClass = CheckIn.class;

    public CheckInBeanInfo() {
    }

    @Override
    public PropertyDescriptor[] getPropertyDescriptorsInternal() throws IntrospectionException {
        PropertyDescriptor _cancel = new PropertyDescriptor("cancel", this.beanClass, "isCancel", "setCancel");
        PropertyDescriptor _currentLocation = new PropertyDescriptor("currentLocation", this.beanClass, "getCurrentLocation", "setCurrentLocation");
        PropertyDescriptor _institutionId = new PropertyDescriptor("institutionId", this.beanClass, "getInstitutionId", "setInstitutionId");
        PropertyDescriptor _itemIdentifier = new PropertyDescriptor("itemIdentifier", this.beanClass, "getItemIdentifier", "setItemIdentifier");
        PropertyDescriptor _itemProperties = new PropertyDescriptor("itemProperties", this.beanClass, "getItemProperties", "setItemProperties");
        PropertyDescriptor _noBlock = new PropertyDescriptor("noBlock", this.beanClass, "isNoBlock", "setNoBlock");
        PropertyDescriptor _returnDate = new PropertyDescriptor("returnDate", this.beanClass, "getReturnDate", "setReturnDate");
        PropertyDescriptor _terminalPassword = new PropertyDescriptor("terminalPassword", this.beanClass, "getTerminalPassword", "setTerminalPassword");
        PropertyDescriptor _transactionDate = new PropertyDescriptor("transactionDate", this.beanClass, "getTransactionDate", "setTransactionDate");

        _currentLocation.setValue("SIPFieldDescriptor", new TaggedFieldDescriptor(true));
        _noBlock.setValue("SIPFieldDescriptor", new PositionedFieldDescriptor(2, 2));
        _transactionDate.setValue("SIPFieldDescriptor", new PositionedFieldDescriptor(3, 20));
        _returnDate.setValue("SIPFieldDescriptor", new PositionedFieldDescriptor(21, 38));

        _itemIdentifier.setValue("SIPFieldDescriptor", new TaggedFieldDescriptor(true));
        _itemProperties.setValue("SIPFieldDescriptor", new TaggedFieldDescriptor(false));
        _terminalPassword.setValue("SIPFieldDescriptor", new TaggedFieldDescriptor(true));

        PropertyDescriptor[] pds = new PropertyDescriptor[] {
                _cancel,
                _currentLocation,
                _institutionId,
                _itemIdentifier,
                _itemProperties,
                _noBlock,
                _returnDate,
                _terminalPassword,
                _transactionDate };
        return pds;
    }
}
