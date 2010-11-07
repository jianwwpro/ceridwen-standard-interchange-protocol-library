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

import java.util.Date;

import com.ceridwen.circulation.SIP.types.enumerations.CurrencyType;
import com.ceridwen.circulation.SIP.types.enumerations.FeeType;
import com.ceridwen.circulation.SIP.types.enumerations.MediaType;

public class CheckOutResponse extends Message {
    /**
	 * 
	 */
    private static final long serialVersionUID = 9222995766948881317L;
    private Boolean ok;
    private Boolean renewalOk;
    private Boolean magneticMedia;
    private Boolean desensitize;
    private Date transactionDate;
    private String institutionId;
    private String patronIdentifier;
    private String itemIdentifier;
    private String titleIdentifier;
    private String dueDate;
    private FeeType feeType;
    private Boolean securityInhibit;
    private CurrencyType currencyType;
    private String feeAmount;
    private MediaType mediaType;
    private String itemProperties;
    private String transactionId;
    private String screenMessage;
    private String printLine;

    @Override
    public String getCommand() {
        return "12";
    }

    public CurrencyType getCurrencyType() {
        return this.currencyType;
    }

    public Boolean isDesensitize() {
        return this.desensitize;
    }

    public String getDueDate() {
        return this.dueDate;
    }

    public String getFeeAmount() {
        return this.feeAmount;
    }

    public FeeType getFeeType() {
        return this.feeType;
    }

    public String getInstitutionId() {
        return this.institutionId;
    }

    public String getItemIdentifier() {
        return this.itemIdentifier;
    }

    public String getItemProperties() {
        return this.itemProperties;
    }

    public Boolean isMagneticMedia() {
        return this.magneticMedia;
    }

    public MediaType getMediaType() {
        return this.mediaType;
    }

    public Boolean isOk() {
        return this.ok;
    }

    public String getPatronIdentifier() {
        return this.patronIdentifier;
    }

    public String getPrintLine() {
        return this.printLine;
    }

    public Boolean isRenewalOk() {
        return this.renewalOk;
    }

    public String getScreenMessage() {
        return this.screenMessage;
    }

    public Boolean isSecurityInhibit() {
        return this.securityInhibit;
    }

    public String getTitleIdentifier() {
        return this.titleIdentifier;
    }

    public Date getTransactionDate() {
        return this.transactionDate;
    }

    public String getTransactionId() {
        return this.transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public void setTitleIdentifier(String titleIdentifier) {
        this.titleIdentifier = titleIdentifier;
    }

    public void setSecurityInhibit(Boolean securityInhibit) {
        this.securityInhibit = securityInhibit;
    }

    public void setScreenMessage(String screenMessage) {
        this.screenMessage = screenMessage;
    }

    public void setRenewalOk(Boolean renewalOk) {
        this.renewalOk = renewalOk;
    }

    public void setPrintLine(String printLine) {
        this.printLine = printLine;
    }

    public void setPatronIdentifier(String patronIdentifier) {
        this.patronIdentifier = patronIdentifier;
    }

    public void setOk(Boolean ok) {
        this.ok = ok;
    }

    public void setMediaType(MediaType mediaType) {
        this.mediaType = mediaType;
    }

    public void setMagneticMedia(Boolean magneticMedia) {
        this.magneticMedia = magneticMedia;
    }

    public void setItemProperties(String itemProperties) {
        this.itemProperties = itemProperties;
    }

    public void setItemIdentifier(String itemIdentifier) {
        this.itemIdentifier = itemIdentifier;
    }

    public void setInstitutionId(String institutionId) {
        this.institutionId = institutionId;
    }

    public void setFeeType(FeeType feeType) {
        this.feeType = feeType;
    }

    public void setFeeAmount(String feeAmount) {
        this.feeAmount = feeAmount;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public void setDesensitize(Boolean desensitize) {
        this.desensitize = desensitize;
    }

    public void setCurrencyType(CurrencyType currencyType) {
        this.currencyType = currencyType;
    }
}
