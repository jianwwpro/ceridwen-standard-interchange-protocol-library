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

public class CheckOutResponseBeanInfo extends MessageBeanInfo {
    Class<CheckOutResponse> beanClass = CheckOutResponse.class;

    public CheckOutResponseBeanInfo() {
    }

    @Override
    public PropertyDescriptor[] getPropertyDescriptorsInternal() throws IntrospectionException {
        PropertyDescriptor _currencyType = new PropertyDescriptor("currencyType", this.beanClass, "getCurrencyType", "setCurrencyType");
        PropertyDescriptor _desensitize = new PropertyDescriptor("desensitize", this.beanClass, "isDesensitize", "setDesensitize");
        PropertyDescriptor _dueDate = new PropertyDescriptor("dueDate", this.beanClass, "getDueDate", "setDueDate");
        PropertyDescriptor _feeAmount = new PropertyDescriptor("feeAmount", this.beanClass, "getFeeAmount", "setFeeAmount");
        PropertyDescriptor _feeType = new PropertyDescriptor("feeType", this.beanClass, "getFeeType", "setFeeType");
        PropertyDescriptor _institutionId = new PropertyDescriptor("institutionId", this.beanClass, "getInstitutionId", "setInstitutionId");
        PropertyDescriptor _itemIdentifier = new PropertyDescriptor("itemIdentifier", this.beanClass, "getItemIdentifier", "setItemIdentifier");
        PropertyDescriptor _itemProperties = new PropertyDescriptor("itemProperties", this.beanClass, "getItemProperties", "setItemProperties");
        PropertyDescriptor _magneticMedia = new PropertyDescriptor("magneticMedia", this.beanClass, "isMagneticMedia", "setMagneticMedia");
        PropertyDescriptor _mediaType = new PropertyDescriptor("mediaType", this.beanClass, "getMediaType", "setMediaType");
        PropertyDescriptor _ok = new PropertyDescriptor("ok", this.beanClass, "isOk", "setOk");
        PropertyDescriptor _patronIdentifier = new PropertyDescriptor("patronIdentifier", this.beanClass, "getPatronIdentifier", "setPatronIdentifier");
        PropertyDescriptor _printLine = new PropertyDescriptor("printLine", this.beanClass, "getPrintLine", "setPrintLine");
        PropertyDescriptor _renewalOk = new PropertyDescriptor("renewalOk", this.beanClass, "isRenewalOk", "setRenewalOk");
        PropertyDescriptor _screenMessage = new PropertyDescriptor("screenMessage", this.beanClass, "getScreenMessage", "setScreenMessage");
        PropertyDescriptor _securityInhibit = new PropertyDescriptor("securityInhibit", this.beanClass, "isSecurityInhibit", "setSecurityInhibit");
        PropertyDescriptor _titleIdentifier = new PropertyDescriptor("titleIdentifier", this.beanClass, "getTitleIdentifier", "setTitleIdentifier");
        PropertyDescriptor _transactionDate = new PropertyDescriptor("transactionDate", this.beanClass, "getTransactionDate", "setTransactionDate");
        PropertyDescriptor _transactionId = new PropertyDescriptor("transactionId", this.beanClass, "getTransactionId", "setTransactionId");

        _ok.setValue("SIPFieldDescriptor", new PositionedFieldDescriptor(2, 2));
        _renewalOk.setValue("SIPFieldDescriptor", new PositionedFieldDescriptor(3, 3));
        _magneticMedia.setValue("SIPFieldDescriptor", new PositionedFieldDescriptor(4, 4));
        _desensitize.setValue("SIPFieldDescriptor", new PositionedFieldDescriptor(5, 5));
        _transactionDate.setValue("SIPFieldDescriptor", new PositionedFieldDescriptor(6, 23));

        _currencyType.setValue("SIPFieldDescriptor", new TaggedFieldDescriptor(false));
        _feeType.setValue("SIPFieldDescriptor", new TaggedFieldDescriptor(false));
        _dueDate.setValue("SIPFieldDescriptor", new TaggedFieldDescriptor(true));
        _feeAmount.setValue("SIPFieldDescriptor", new TaggedFieldDescriptor(false));
        _itemIdentifier.setValue("SIPFieldDescriptor", new TaggedFieldDescriptor(true));
        _itemProperties.setValue("SIPFieldDescriptor", new TaggedFieldDescriptor(false));
        _patronIdentifier.setValue("SIPFieldDescriptor", new TaggedFieldDescriptor(true));
        _titleIdentifier.setValue("SIPFieldDescriptor", new TaggedFieldDescriptor(true));

        PropertyDescriptor[] pds = new PropertyDescriptor[] {
                _currencyType,
                _desensitize,
                _dueDate,
                _feeAmount,
                _feeType,
                _institutionId,
                _itemIdentifier,
                _itemProperties,
                _magneticMedia,
                _mediaType,
                _ok,
                _patronIdentifier,
                _printLine,
                _renewalOk,
                _screenMessage,
                _securityInhibit,
                _titleIdentifier,
                _transactionDate,
                _transactionId };
        return pds;
    }
}
