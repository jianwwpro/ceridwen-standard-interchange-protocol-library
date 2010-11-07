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
package com.ceridwen.circulation.SIP.tests;

import com.ceridwen.circulation.SIP.messages.Message;
import com.ceridwen.circulation.SIP.messages.RenewResponse;
import com.ceridwen.circulation.SIP.types.enumerations.CurrencyType;
import com.ceridwen.circulation.SIP.types.enumerations.FeeType;
import com.ceridwen.circulation.SIP.types.enumerations.MediaType;

public class RenewResponseTest extends AbstractMessageTest<RenewResponse> {
    @Override
    public Message getDefaultMessage() {
        RenewResponse m = new RenewResponse();

        m.setTransactionDate(new java.util.Date(0));

        return m;
    }

    @Override
    public String getDefaultEncoding() {
        return "300NUN19700101    010000AA|AB|AH|AJ|AO|";
    }

    @Override
    public Message getMessage() {
        RenewResponse m = new RenewResponse();

        m.setCurrencyType(CurrencyType.UK_POUNDS);
        m.setDesensitize(true);
        m.setDueDate("dueDate");
        m.setFeeAmount("feeAmount");
        m.setFeeType(FeeType.REPLACEMENT);
        m.setInstitutionId("institutionId");
        m.setItemIdentifier("itemIdentifier");
        m.setItemProperties("itemProperties");
        m.setMagneticMedia(true);
        m.setMediaType(MediaType.DISKETTE);
        m.setOk(true);
        m.setPatronIdentifier("patronIdentifier");
        m.setPrintLine("printLine");
        m.setRenewalOk(true);
        m.setScreenMessage("screenMessage");
        m.setSecurityInhibit(true);
        m.setTitleIdentifier("titleIdentifier");
        m.setTransactionDate(new java.util.Date(0));
        m.setTransactionId("transactionId");

        return m;
    }

    @Override
    public String getEncoding() {
        return "301YYY19700101    010000AApatronIdentifier|ABitemIdentifier|AFscreenMessage|AGprintLine|AHdueDate|AJtitleIdentifier|AOinstitutionId|BHGBP|BKtransactionId|BT07|BVfeeAmount|CHitemProperties|CIY|CK007|";
    }
}
