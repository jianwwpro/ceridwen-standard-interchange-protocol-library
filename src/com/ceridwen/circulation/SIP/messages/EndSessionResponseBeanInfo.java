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

public class EndSessionResponseBeanInfo extends MessageBeanInfo {
    Class<EndSessionResponse> beanClass = EndSessionResponse.class;

    public EndSessionResponseBeanInfo() {
    }

    @Override
    public PropertyDescriptor[] getPropertyDescriptorsInternal() throws IntrospectionException {
        PropertyDescriptor _endSession = new PropertyDescriptor("endSession", this.beanClass, "isEndSession", "setEndSession");
        PropertyDescriptor _transactionDate = new PropertyDescriptor("transactionDate", this.beanClass, "getTransactionDate", "setTransactionDate");
        PropertyDescriptor _institutionId = new PropertyDescriptor("institutionId", this.beanClass, "getInstitutionId", "setInstitutionId");
        PropertyDescriptor _patronIdentifier = new PropertyDescriptor("patronIdentifier", this.beanClass, "getPatronIdentifier", "setPatronIdentifier");
        PropertyDescriptor _screenMessage = new PropertyDescriptor("screenMessage", this.beanClass, "getScreenMessage", "setScreenMessage");
        PropertyDescriptor _printLine = new PropertyDescriptor("printLine", this.beanClass, "getPrintLine", "setPrintLine");

        _endSession.setValue("SIPFieldDescriptor", new PositionedFieldDescriptor(2, 2));
        _transactionDate.setValue("SIPFieldDescriptor", new PositionedFieldDescriptor(3, 20));

        _patronIdentifier.setValue("SIPFieldDescriptor", new TaggedFieldDescriptor(true));

        PropertyDescriptor[] pds = new PropertyDescriptor[] {
                _endSession,
                _transactionDate,
                _institutionId,
                _patronIdentifier,
                _screenMessage,
                _printLine };
        return pds;
    }
}
