/* ***************************************************************************

 @(#) $RCSfile$ $Name$($Revision$) $Date$

 -----------------------------------------------------------------------------

 Copyright (c) 2008-2009  Monavacon Limited <http://www.monavacon.com/>
 Copyright (c) 2001-2008  OpenSS7 Corporation <http://www.openss7.com/>
 Copyright (c) 1997-2001  Brian F. G. Bidulock <bidulock@openss7.org>

 All Rights Reserved.

 This program is free software: you can redistribute it and/or modify it under
 the terms of the GNU Affero General Public License as published by the Free
 Software Foundation, version 3 of the license.

 This program is distributed in the hope that it will be useful, but WITHOUT
 ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 FOR A PARTICULAR PURPOSE.  See the GNU Affero General Public License for more
 details.

 You should have received a copy of the GNU Affero General Public License
 along with this program.  If not, see <http://www.gnu.org/licenses/>, or
 write to the Free Software Foundation, Inc., 675 Mass Ave, Cambridge, MA
 02139, USA.

 -----------------------------------------------------------------------------

 U.S. GOVERNMENT RESTRICTED RIGHTS.  If you are licensing this Software on
 behalf of the U.S. Government ("Government"), the following provisions apply
 to you.  If the Software is supplied by the Department of Defense ("DoD"), it
 is classified as "Commercial Computer Software" under paragraph 252.227-7014
 of the DoD Supplement to the Federal Acquisition Regulations ("DFARS") (or any
 successor regulations) and the Government is acquiring only the license rights
 granted herein (the license rights customarily provided to non-Government
 users).  If the Software is supplied to any unit or agency of the Government
 other than DoD, it is classified as "Restricted Computer Software" and the
 Government's rights in the Software are defined in paragraph 52.227-19 of the
 Federal Acquisition Regulations ("FAR") (or any successor regulations) or, in
 the cases of NASA, in paragraph 18.52.227-86 of the NASA Supplement to the FAR
 (or any successor regulations).

 -----------------------------------------------------------------------------

 Commercial licensing and support of this software is available from OpenSS7
 Corporation at a fee.  See http://www.openss7.com/

 -----------------------------------------------------------------------------

 Last Modified $Date$ by $Author$

 -----------------------------------------------------------------------------

 $Log$
 *****************************************************************************/

package javax.jain.ss7.isup;

import javax.jain.ss7.*;
import javax.jain.*;

/** A class representing a Generic Number parameter.
    The ITU Generic Number parameter and ANSI Generic Address parameter have been merged
    to JAIN GenericNumber class. This class contains all the subfields common to ITU and
    ANSI variants. The ANSI variant has no other sub-fields and is instantiated by this
    class. The ITU variant inherits from this class and adds the ITU specific sub-fields
    to this class.
    @author Monavacon Limited
    @version 1.2.2
  */
public class GenericNumber extends NumberParameter {
    public static final short NQI_DIALED_DIGITS = 0;
    public static final short NQI_ADDITIONAL_CALLED_NUMBER = 1;
    public static final short NQI_SUPPLEMENTAL_CALLING_NUMBER_FAILED_NETWORK_SCREENING = 2;
    public static final short NQI_SUPPLEMENTAL_CALLING_NUMBER_NOT_SCREENED = 3;
    public static final short NQI_REDIRECTING_TERMINATING_NUMBER = 4;
    public static final short NQI_ADDITIONAL_CONNECTED_NUMBER = 5;
    public static final short NQI_ADDITIONAL_CALLING_PARTY_NUMBER = 6;
    public static final short NQI_ADDITIONAL_ORIGINAL_CALLED_NUMBER = 7;
    public static final short NQI_ADDITIONAL_REDIRECTING_NUMBER = 8;
    public static final short NQI_ADDITIONAL_REDIRECTION_NUMBER = 9;
    public static final short NQI_TRANSFER_NUMBER_6 = 248;
    public static final short NQI_TRANSFER_NUMBER_5 = 249;
    public static final short NQI_TRANSFER_NUMBER_4 = 250;
    public static final short NQI_TRANSFER_NUMBER_3 = 251;
    public static final short NQI_TRANSFER_NUMBER_2 = 252;
    public static final short NQI_TRANSFER_NUMBER_1 = 253;
    public static final short NQI_CALLER_EMERGENCY_SERVICE_IDENTIFICATION = 254;
    public static final byte APRI_PRESENTATION_ALLOWED = 0;
    public static final byte APRI_PRESENTATION_RESTRICTED = 1;
    public static final byte APRI_ADDRESS_NOT_AVAILABLE = 2;

    /** Constructs a new GenericDigits taking no parameters.
        This constructor sets all the sub-field values to their spare value (which is
        zero).
      */
    public GenericNumber() {
    }
    /** Constructor For GenericNumber.
        @param numberQualifierIndicator  The number qualifier indicator, range 0-255. <ul>
        <li>NQI_DIALED_DIGITS,
        <li>NQI_ADDITIONAL_CALLED_NUMBER,
        <li>NQI_SUPPLEMENTAL_CALLING_NUMBER_FAILED_NETWORK_SCREENING,
        <li>NQI_SUPPLEMENTAL_CALLING_NUMBER_NOT_SCREENED,
        <li>NQI_DIALED_DIGITS (ITU only),
        <li>NQI_ADDITIONAL_CALLING_PARTY_NUMBER (ITU only),
        <li>NQI_ADDITIONAL_ORIGINAL_CALLED_NUMBER (ITU only),
        <li>NQI_ADDITIONAL_REDIRECTING_NUMBER (ITU only),
        <li>NQI_ADDITIONAL_REDIRECTION_NUMBER (ITU only),
        <li>NQI_TRANSFER_NUMBER_6 (ANSI only),
        <li>NQI_TRANSFER_NUMBER_5 (ANSI only),
        <li>NQI_TRANSFER_NUMBER_4 (ANSI only),
        <li>NQI_TRANSFER_NUMBER_3 (ANSI only),
        <li>NQI_TRANSFER_NUMBER_2 (ANSI only),
        <li>NQI_TRANSFER_NUMBER_1 (ANSI only) and
        <li>NQI_CALLER_EMERGENCY_SERVICE_IDENTIFICATION (ANSI only). </ul>
        @param natureOfAddressIndicator  The nature of address indicator, see
        NumberParameter().
        @param numberingPlanIndicator  The numbering plan indicator, see
        NumberParameter().
        @param addressPresentationRestrictedIndicator  The address presentation restricted
        indicator. <ul> <li>APRI_PRESENTATION_ALLOWED, <li>APRI_PRESENTATION_RESTRICTED
        and <li>APRI_ADDRESS_NOT_AVAILABLE. </ul>
        @param addressSignal  The address signal.
        @exception ParameterRangeInvalidException  Thrown when value is out of range.
      */
    public GenericNumber(short numberQualifierIndicator, byte natureOfAddressIndicator,
            byte numberingPlanIndicator, byte addressPresentationRestrictedIndicator,
            byte[] addressSignal)
        throws ParameterRangeInvalidException {
        super(natureOfAddressIndicator, numberingPlanIndicator, addressSignal);
        this.setNumberQualifierIndicator(numberQualifierIndicator);
        this.setAddrPresRestInd(addressPresentationRestrictedIndicator);
    }
    /** Gets Number Qualifier Indicator.
        @return The number qualifier indicator, range 0 to 255, see GenericNumber().
      */
    public short getNumberQualifierIndicator() {
        return m_numberQualifierIndicator;
    }
    /** Sets Number Qualifier Indicator.
        @param numberQualifierIndicator  Range 0 to 255, see GenericNumber().
      */
    public void setNumberQualifierIndicator(short numberQualifierIndicator)
        throws ParameterRangeInvalidException {
        if (0 <= numberQualifierIndicator && numberQualifierIndicator <= 255) {
            m_numberQualifierIndicator = numberQualifierIndicator;
            return;
        }
        throw new ParameterRangeInvalidException("NumberQualifierIndicator value " + numberQualifierIndicator + " out of range.");
    }
    /** Gets the Address Presentation Restricted Ind field of the parameter.
        @return The address presentation indicator, range 0 to 3, see GenericNumber().
      */
    public byte getAddrPresRestInd() {
        return m_addressPresentationRestrictedIndicator;
    }
    /** Sets the Address Presentation Restricted Ind field of the parameter.
        @param addrPresRestInd  Address presentation restriction indicator value, range 0
        to 3, see GenericNumber().
      */
    public void setAddrPresRestInd(byte addressPresentationRestrictedIndicator)
        throws ParameterRangeInvalidException {
        if (0 <= addressPresentationRestrictedIndicator && addressPresentationRestrictedIndicator <= 3) {
            m_addressPresentationRestrictedIndicator = addressPresentationRestrictedIndicator;
            return;
        }
        throw new ParameterRangeInvalidException("AddrPresRestInd value " + addressPresentationRestrictedIndicator + " out of range.");
    }
    /** The toString method retrieves a string containing the values of the members of the
        GenericNumber class.
        @return A string representation of the member variables.
      */
    public java.lang.String toString() {
        StringBuffer b = new StringBuffer(512);
        b.append(super.toString());
        b.append("\njavax.jain.ss7.isup.GenericNumber");
        b.append("\n\tm_numberQualifierIndicator: " + m_numberQualifierIndicator);
        b.append("\n\tm_addressPresentationRestrictedIndicator: " + m_addressPresentationRestrictedIndicator);
        return b.toString();
    }
    protected short m_numberQualifierIndicator;
    protected byte m_addressPresentationRestrictedIndicator;
}

// vim: sw=4 et tw=90 com=srO\:/**,mb\:*,ex\:*/,srO\:/*,mb\:*,ex\:*/,b\:TRANS,\://,b\:#,\:%,\:XCOMM,n\:>,fb\:-