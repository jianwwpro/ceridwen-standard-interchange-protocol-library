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

import java.util.Date;

import com.ceridwen.circulation.SIP.types.enumerations.CurrencyType;
import com.ceridwen.circulation.SIP.types.enumerations.Language;
import com.ceridwen.circulation.SIP.types.flagfields.PatronStatus;

/**
 * <p>Title: RTSI</p> <p>Description: Real Time Self Issue</p> <p>Copyright:
 * </p>
 * 
 * @author Matthew J. Dovey
 * @version 1.0
 */

public class PatronStatusResponse extends Message {
    /**
	 * 
	 */
    private static final long serialVersionUID = 163945073911230183L;
    private PatronStatus patronStatus = new PatronStatus();
    private Language language;
    private Date transactionDate;
    private String institutionId;
    private String patronIdentifier;
    private String personalName;
    private Boolean validPatron;
    private Boolean validPatronPassword;
    private CurrencyType currencyType;
    private String feeAmount;
    private String screenMessage;
    private String printLine;

    @Override
    public String getCommand() {
        return "24";
    }

    public CurrencyType getCurrencyType() {
        return this.currencyType;
    }

    public String getFeeAmount() {
        return this.feeAmount;
    }

    public String getInstitutionId() {
        return this.institutionId;
    }

    public Language getLanguage() {
        return this.language;
    }

    public String getPrintLine() {
        return this.printLine;
    }

    public String getPatronIdentifier() {
        return this.patronIdentifier;
    }

    public PatronStatus getPatronStatus() {
        return this.patronStatus;
    }

    public String getPersonalName() {
        return this.personalName;
    }

    public String getScreenMessage() {
        return this.screenMessage;
    }

    public Date getTransactionDate() {
        return this.transactionDate;
    }

    public Boolean isValidPatron() {
        return this.validPatron;
    }

    public Boolean isValidPatronPassword() {
        return this.validPatronPassword;
    }

    public void setValidPatronPassword(Boolean validPatronPassword) {
        this.validPatronPassword = validPatronPassword;
    }

    public void setValidPatron(Boolean validPatron) {
        this.validPatron = validPatron;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public void setScreenMessage(String screenMessage) {
        this.screenMessage = screenMessage;
    }

    public void setPrintLine(String printLine) {
        this.printLine = printLine;
    }

    public void setPersonalName(String personalName) {
        this.personalName = personalName;
    }

    @Deprecated
    public void setPatronStatus(PatronStatus patronStatus) {
        this.patronStatus = patronStatus;
    }

    public void setPatronIdentifier(String patronIdentifier) {
        this.patronIdentifier = patronIdentifier;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public void setInstitutionId(String institutionId) {
        this.institutionId = institutionId;
    }

    public void setFeeAmount(String feeAmount) {
        this.feeAmount = feeAmount;
    }

    public void setCurrencyType(CurrencyType currencyType) {
        this.currencyType = currencyType;
    }
}
