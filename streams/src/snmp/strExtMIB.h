/*****************************************************************************

 @(#) $Id: strExtMIB.h,v 0.9.2.7 2009-01-14 14:32:00 brian Exp $

 -----------------------------------------------------------------------------

 Copyright (c) 2008-2009  Monavacon Limited <http://www.monavacon.com/>
 Copyright (c) 2001-2008  OpenSS7 Corporation <http://www.openss7.com/>
 Copyright (c) 1997-2001  Brian F. G. Bidulock <bidulock@openss7.org>

 All Rights Reserved.

 This program is free software; you can redistribute it and/or modify it under
 the terms of the GNU Affero General Public License as published by the Free
 Software Foundation; version 3 of the License.

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

 Last Modified $Date: 2009-01-14 14:32:00 $ by $Author: brian $

 -----------------------------------------------------------------------------

 $Log: strExtMIB.h,v $
 Revision 0.9.2.7  2009-01-14 14:32:00  brian
 - working up agents

 Revision 0.9.2.6  2009-01-10 17:19:50  brian
 - updated agents

 Revision 0.9.2.5  2009-01-04 13:16:13  brian
 - updated agents

 Revision 0.9.2.4  2009-01-03 10:51:13  brian
 - updated agent

 Revision 0.9.2.3  2009-01-02 15:04:19  brian
 - updated agents

 Revision 0.9.2.2  2008-12-31 16:04:52  brian
 - updated mibs

 Revision 0.9.2.1  2008-12-27 15:36:41  brian
 - added extention mib

 *****************************************************************************/

#ifndef __LOCAL_STREXTMIB_H__
#define __LOCAL_STREXTMIB_H__

#ident "@(#) $RCSfile: strExtMIB.h,v $ $Name:  $($Revision: 0.9.2.7 $) Copyright (c) 2008-2009 Monavacon Limited."

/*
 * This file was generated by mib2c and is intended for use as a mib module
 * for the ucd-snmp snmpd agent.
 */
/* our storage structure(s) */
struct strExtMIB_data {
	uint strExtMIB_request;
	ulong strNlogargs;		/* ReadWrite */
};
struct strExtStrlogRecordTable_data {
	uint strExtStrlogRecordTable_request;
	uint strExtStrlogRecordTable_refs;
	ulong strExtStrlogRecordNextIndex;	/* ReadOnly */
	ulong strExtStrlogRecordIndex;	/* NoAccess */
	long strExtStrlogRecordTimeStamp;	/* ReadOnly */
	ulong strExtStrlogRecordMid;	/* Create */
	ulong strExtStrlogRecordSid;	/* Create */
	ulong strExtStrlogRecordLevel;	/* Create */
	uint8_t *strExtStrlogRecordFlags;	/* Create */
	size_t strExtStrlogRecordFlagsLen;
	uint8_t *strExtStrlogRecordMsgString;	/* Create */
	size_t strExtStrlogRecordMsgStringLen;
	long strExtStrlogRecordRowStatus;	/* Create */
};
struct strExtStrlogRecordTable_data {
	uint strExtStrlogRecordTable_request;
	uint strExtStrlogRecordTable_refs;
	ulong strExtStrlogRecordNextIndex;	/* ReadOnly */
	ulong strExtStrlogRecordIndex;	/* NoAccess */
	long strExtStrlogRecordTimeStamp;	/* ReadOnly */
	ulong strExtStrlogRecordMid;	/* Create */
	ulong strExtStrlogRecordSid;	/* Create */
	ulong strExtStrlogRecordLevel;	/* Create */
	uint8_t *strExtStrlogRecordFlags;	/* Create */
	size_t strExtStrlogRecordFlagsLen;
	uint8_t *strExtStrlogRecordMsgString;	/* Create */
	size_t strExtStrlogRecordMsgStringLen;
	long strExtStrlogRecordRowStatus;	/* Create */
};

/* storage declarations */
extern struct strExtMIB_data *strExtMIBStorage;
extern struct header_complex_index *strExtStrlogRecordTableStorage;
extern struct header_complex_index *strExtStrlogRecordTableStorage;

/* enum definitions from the covered mib sections */

#define STREXTSTRLOGRECORDFLAGS_SLERROR          0
#define STREXTSTRLOGRECORDFLAGS_SLTRACE          1
#define STREXTSTRLOGRECORDFLAGS_SLNOTIFY         2
#define STREXTSTRLOGRECORDFLAGS_SLCONSOLE        3
#define STREXTSTRLOGRECORDFLAGS_SLFATAL          4
#define STREXTSTRLOGRECORDFLAGS_SLWARN           5
#define STREXTSTRLOGRECORDFLAGS_SLNOTE           6
#define STREXTSTRLOGRECORDFLAGS_SLNOPUTBUF       7

#define STREXTSTRLOGFLAGS_SLERROR                0
#define STREXTSTRLOGFLAGS_SLTRACE                1
#define STREXTSTRLOGFLAGS_SLNOTIFY               2
#define STREXTSTRLOGFLAGS_SLCONSOLE              3
#define STREXTSTRLOGFLAGS_SLFATAL                4
#define STREXTSTRLOGFLAGS_SLWARN                 5
#define STREXTSTRLOGFLAGS_SLNOTE                 6
#define STREXTSTRLOGFLAGS_SLNOPUTBUF             7

/* notifications */
extern oid strStrlogRecord_oid[10];

/* scalars accessible only for notify */
extern oid strExtStrlogTimeStamp_oid[12];
extern oid strExtStrlogMid_oid[12];
extern oid strExtStrlogSid_oid[12];
extern oid strExtStrlogLevel_oid[12];
extern oid strExtStrlogFlags_oid[12];
extern oid strExtStrlogFmtString_oid[12];
extern oid strExtStrlogInteger_oid[12];
extern oid strExtStrlogUnsigned_oid[12];
extern oid strExtStrlogString_oid[12];

/* object id definitions */

/* function prototypes */
/* trap function prototypes */
extern void send_strStrlogRecord_v2trap(struct variable_list *);

/* variable function prototypes */
void init_strExtMIB(void);
void deinit_strExtMIB(void);
int term_strExtMIB(int majorID, int minorID, void *serverarg, void *clientarg);
FindVarMethod var_strExtMIB;
void parse_strExtMIB(const char *, char *);
SNMPCallback store_strExtMIB;
void refresh_strExtMIB(int);
FindVarMethod var_strExtStrlogRecordTable;
struct strExtStrlogRecordTable_data *strExtStrlogRecordTable_create(void);
struct strExtStrlogRecordTable_data *strExtStrlogRecordTable_duplicate(struct strExtStrlogRecordTable_data *);
int strExtStrlogRecordTable_destroy(struct strExtStrlogRecordTable_data **);
int strExtStrlogRecordTable_add(struct strExtStrlogRecordTable_data *);
int strExtStrlogRecordTable_del(struct strExtStrlogRecordTable_data *);
void parse_strExtStrlogRecordTable(const char *, char *);
SNMPCallback store_strExtStrlogRecordTable;
void refresh_strExtStrlogRecordTable(int);
FindVarMethod var_strExtStrlogRecordTable;
struct strExtStrlogRecordTable_data *strExtStrlogRecordTable_create(void);
struct strExtStrlogRecordTable_data *strExtStrlogRecordTable_duplicate(struct strExtStrlogRecordTable_data *);
int strExtStrlogRecordTable_destroy(struct strExtStrlogRecordTable_data **);
int strExtStrlogRecordTable_add(struct strExtStrlogRecordTable_data *);
int strExtStrlogRecordTable_del(struct strExtStrlogRecordTable_data *);
void parse_strExtStrlogRecordTable(const char *, char *);
SNMPCallback store_strExtStrlogRecordTable;
void refresh_strExtStrlogRecordTable(int);

WriteMethod write_strExtStrlogRecordMid;
WriteMethod write_strExtStrlogRecordSid;
WriteMethod write_strExtStrlogRecordLevel;
WriteMethod write_strExtStrlogRecordFlags;
WriteMethod write_strExtStrlogRecordMsgString;
WriteMethod write_strExtStrlogRecordRowStatus;
WriteMethod write_strNlogargs;
#endif				/* __LOCAL_STREXTMIB_H__ */