package moc.egg;
import mg.egg.eggc.runtime.libjava.lex.*;

public class JLEX_ASM implements  LEX_ANALYZER  {
	private final int YY_BUFFER_SIZE = 512;
	private final int YY_F = -1;
	private final int YY_NO_STATE = -1;
	private final int YY_NOT_ACCEPT = 0;
	private final int YY_START = 1;
	private final int YY_END = 2;
	private final int YY_NO_ANCHOR = 4;
	private final int YY_BOL = 256;
	private final int YY_EOF = 257;

	private java.io.BufferedReader yy_reader;
	private int yy_buffer_index;
	private int yy_buffer_read;
	private int yy_buffer_start;
	private int yy_buffer_end;
	private char yy_buffer[];
	private int yychar;
	private int yyline;
	private boolean yy_at_bol;
	private int yy_lexical_state;

	public JLEX_ASM (java.io.Reader reader) {
		this ();
		if (null == reader) {
			throw (new Error("Error: Bad input stream initializer."));
		}
		yy_reader = new java.io.BufferedReader(reader);
	}

	public JLEX_ASM (java.io.InputStream instream) {
		this ();
		if (null == instream) {
			throw (new Error("Error: Bad input stream initializer."));
		}
		yy_reader = new java.io.BufferedReader(new java.io.InputStreamReader(instream));
	}

	public JLEX_ASM () {
		yy_buffer = new char[YY_BUFFER_SIZE];
		yy_buffer_read = 0;
		yy_buffer_index = 0;
		yy_buffer_start = 0;
		yy_buffer_end = 0;
		yychar = 0;
		yyline = 0;
		yy_at_bol = true;
		yy_lexical_state = YYINITIAL;
	}

	public void fromContext(LEX_CONTEXTE cont) {
		yy_reader = cont.source;
		yy_buffer = cont.buffer;
		yy_buffer_read = cont.b_read;
		yy_buffer_index = cont.b_index;
		yy_buffer_start = cont.b_start;
		yy_buffer_end = cont.b_end;
		yychar = cont.car;
		yyline = cont.ligne;
		yy_at_bol = true;
		yy_lexical_state = YYINITIAL;
	}
	public void toContext(LEX_CONTEXTE cont) {		cont.source = yy_reader;
		cont.buffer = yy_buffer;
		cont.b_read = yy_buffer_read;
		cont.b_index = yy_buffer_index;
		cont.b_start = yy_buffer_start;
		cont.b_end = yy_buffer_end;
		cont.ligne = yyline;
		cont.car = yychar;
	}
	public void setReader(java.io.BufferedReader r) {
		yy_reader = r;
	}
	private boolean yy_eof_done = false;
	private final int YYINITIAL = 0;
	private final int yy_state_dtrans[] = {
		0
	};
	private void yybegin (int state) {
		yy_lexical_state = state;
	}
	private int yy_advance ()
		throws java.io.IOException {
		int next_read;
		int i;
		int j;

		if (yy_buffer_index < yy_buffer_read) {
			return yy_buffer[yy_buffer_index++];
		}

		if (0 != yy_buffer_start) {
			i = yy_buffer_start;
			j = 0;
			while (i < yy_buffer_read) {
				yy_buffer[j] = yy_buffer[i];
				++i;
				++j;
			}
			yy_buffer_end = yy_buffer_end - yy_buffer_start;
			yy_buffer_start = 0;
			yy_buffer_read = j;
			yy_buffer_index = j;
			next_read = yy_reader.read(yy_buffer,
					yy_buffer_read,
					yy_buffer.length - yy_buffer_read);
			if (-1 == next_read) {
				return YY_EOF;
			}
			yy_buffer_read = yy_buffer_read + next_read;
		}

		while (yy_buffer_index >= yy_buffer_read) {
			if (yy_buffer_index >= yy_buffer.length) {
				yy_buffer = yy_double(yy_buffer);
			}
			next_read = yy_reader.read(yy_buffer,
					yy_buffer_read,
					yy_buffer.length - yy_buffer_read);
			if (-1 == next_read) {
				return YY_EOF;
			}
			yy_buffer_read = yy_buffer_read + next_read;
		}
		return yy_buffer[yy_buffer_index++];
	}
	private void yy_move_end () {
		if (yy_buffer_end > yy_buffer_start &&
		    '\n' == yy_buffer[yy_buffer_end-1])
			yy_buffer_end--;
		if (yy_buffer_end > yy_buffer_start &&
		    '\r' == yy_buffer[yy_buffer_end-1])
			yy_buffer_end--;
	}
	private boolean yy_last_was_cr=false;
	private void yy_mark_start () {
		int i;
		for (i = yy_buffer_start; i < yy_buffer_index; ++i) {
			if ('\n' == yy_buffer[i] && !yy_last_was_cr) {
				++yyline;
			}
			if ('\r' == yy_buffer[i]) {
				++yyline;
				yy_last_was_cr=true;
			} else yy_last_was_cr=false;
		}
		yychar = yychar
			+ yy_buffer_index - yy_buffer_start;
		yy_buffer_start = yy_buffer_index;
	}
	private void yy_mark_end () {
		yy_buffer_end = yy_buffer_index;
	}
	private void yy_to_mark () {
		yy_buffer_index = yy_buffer_end;
		yy_at_bol = (yy_buffer_end > yy_buffer_start) &&
		            ('\r' == yy_buffer[yy_buffer_end-1] ||
		             '\n' == yy_buffer[yy_buffer_end-1] ||
		             2028/*LS*/ == yy_buffer[yy_buffer_end-1] ||
		             2029/*PS*/ == yy_buffer[yy_buffer_end-1]);
	}
	private java.lang.String yytext () {
		return (new java.lang.String(yy_buffer,
			yy_buffer_start,
			yy_buffer_end - yy_buffer_start));
	}
	private int yylength () {
		return yy_buffer_end - yy_buffer_start;
	}
	private char[] yy_double (char buf[]) {
		int i;
		char newbuf[];
		newbuf = new char[2*buf.length];
		for (i = 0; i < buf.length; ++i) {
			newbuf[i] = buf[i];
		}
		return newbuf;
	}
	private final int YY_E_INTERNAL = 0;
	private final int YY_E_MATCH = 1;
	private java.lang.String yy_error_string[] = {
		"Error: Internal error.\n",
		"Error: Unmatched input.\n"
	};
	private void yy_error (int code,boolean fatal) {
		java.lang.System.out.print(yy_error_string[code]);
		java.lang.System.out.flush();
		if (fatal) {
			throw new Error("Fatal Error.\n");
		}
	}
	private int[][] unpackFromString(int size1, int size2, String st) {
		int colonIndex = -1;
		String lengthString;
		int sequenceLength = 0;
		int sequenceInteger = 0;

		int commaIndex;
		String workString;

		int res[][] = new int[size1][size2];
		for (int i= 0; i < size1; i++) {
			for (int j= 0; j < size2; j++) {
				if (sequenceLength != 0) {
					res[i][j] = sequenceInteger;
					sequenceLength--;
					continue;
				}
				commaIndex = st.indexOf(',');
				workString = (commaIndex==-1) ? st :
					st.substring(0, commaIndex);
				st = st.substring(commaIndex+1);
				colonIndex = workString.indexOf(':');
				if (colonIndex == -1) {
					res[i][j]=Integer.parseInt(workString);
					continue;
				}
				lengthString =
					workString.substring(colonIndex+1);
				sequenceLength=Integer.parseInt(lengthString);
				workString=workString.substring(0,colonIndex);
				sequenceInteger=Integer.parseInt(workString);
				res[i][j] = sequenceInteger;
				sequenceLength--;
			}
		}
		return res;
	}
	private int yy_acpt[] = {
		/* 0 */ YY_NOT_ACCEPT,
		/* 1 */ YY_NO_ANCHOR,
		/* 2 */ YY_NO_ANCHOR,
		/* 3 */ YY_NO_ANCHOR,
		/* 4 */ YY_NO_ANCHOR,
		/* 5 */ YY_NO_ANCHOR,
		/* 6 */ YY_NO_ANCHOR,
		/* 7 */ YY_NO_ANCHOR,
		/* 8 */ YY_NO_ANCHOR,
		/* 9 */ YY_NO_ANCHOR,
		/* 10 */ YY_NO_ANCHOR,
		/* 11 */ YY_NO_ANCHOR,
		/* 12 */ YY_NO_ANCHOR,
		/* 13 */ YY_NO_ANCHOR,
		/* 14 */ YY_NO_ANCHOR,
		/* 15 */ YY_NO_ANCHOR,
		/* 16 */ YY_NO_ANCHOR,
		/* 17 */ YY_NO_ANCHOR,
		/* 18 */ YY_NO_ANCHOR,
		/* 19 */ YY_NO_ANCHOR,
		/* 20 */ YY_NO_ANCHOR,
		/* 21 */ YY_NO_ANCHOR,
		/* 22 */ YY_NO_ANCHOR,
		/* 23 */ YY_NO_ANCHOR,
		/* 24 */ YY_NO_ANCHOR,
		/* 25 */ YY_NO_ANCHOR,
		/* 26 */ YY_NO_ANCHOR,
		/* 27 */ YY_NO_ANCHOR,
		/* 28 */ YY_NO_ANCHOR,
		/* 29 */ YY_NO_ANCHOR,
		/* 30 */ YY_NO_ANCHOR,
		/* 31 */ YY_NO_ANCHOR,
		/* 32 */ YY_NO_ANCHOR,
		/* 33 */ YY_NO_ANCHOR,
		/* 34 */ YY_NO_ANCHOR,
		/* 35 */ YY_NOT_ACCEPT,
		/* 36 */ YY_NO_ANCHOR,
		/* 37 */ YY_NO_ANCHOR,
		/* 38 */ YY_NO_ANCHOR,
		/* 39 */ YY_NO_ANCHOR,
		/* 40 */ YY_NO_ANCHOR,
		/* 41 */ YY_NOT_ACCEPT,
		/* 42 */ YY_NO_ANCHOR,
		/* 43 */ YY_NO_ANCHOR,
		/* 44 */ YY_NOT_ACCEPT,
		/* 45 */ YY_NO_ANCHOR,
		/* 46 */ YY_NO_ANCHOR,
		/* 47 */ YY_NOT_ACCEPT,
		/* 48 */ YY_NO_ANCHOR,
		/* 49 */ YY_NO_ANCHOR,
		/* 50 */ YY_NO_ANCHOR,
		/* 51 */ YY_NO_ANCHOR,
		/* 52 */ YY_NO_ANCHOR,
		/* 53 */ YY_NO_ANCHOR,
		/* 54 */ YY_NO_ANCHOR,
		/* 55 */ YY_NO_ANCHOR,
		/* 56 */ YY_NO_ANCHOR,
		/* 57 */ YY_NO_ANCHOR,
		/* 58 */ YY_NO_ANCHOR,
		/* 59 */ YY_NO_ANCHOR,
		/* 60 */ YY_NO_ANCHOR,
		/* 61 */ YY_NO_ANCHOR,
		/* 62 */ YY_NO_ANCHOR,
		/* 63 */ YY_NO_ANCHOR,
		/* 64 */ YY_NO_ANCHOR,
		/* 65 */ YY_NO_ANCHOR,
		/* 66 */ YY_NO_ANCHOR,
		/* 67 */ YY_NO_ANCHOR,
		/* 68 */ YY_NO_ANCHOR,
		/* 69 */ YY_NO_ANCHOR,
		/* 70 */ YY_NO_ANCHOR,
		/* 71 */ YY_NO_ANCHOR
	};
	private int yy_cmap[] = unpackFromString(1,258,
"30:9,1,28,30:2,28,30:18,1,30,29,37:2,34,30,32,5,6,30:3,7,37,30,33:10,2,38,3" +"7,30,37:3,12,22,19,13,18,27,35,24,14,25,35,10,26,21,11,23,35,17,15,16,20,35" +":5,3,31,4,30,36,30,35:26,8,30,9,30:130,0:2")[0];

	private int yy_rmap[] = unpackFromString(1,72,
"0,1,2,1:5,3,1:2,4,1,5,6,7,1,8,9,1,10,9,11,9:2,12,9:3,13,9,14,9:3,5,15,1,3,5" +",16,17,18,19,16,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39" +",40,9,41,42,43,44,45")[0];

	private int yy_nxt[][] = unpackFromString(46,39,
"1,2,3,4,5,6,7,8,9,10,11,66:4,67,66,68,66,69,66:3,54,70,71,66:2,12,13,37:2,4" +"3,14,46,66:3,15,-1:40,2,-1:70,38,-1:15,66,55,66:16,-1:5,66,-1,66:3,-1:2,35:" +"28,16,35,41,35:7,-1:10,66:18,-1:5,14,-1,66:3,-1:2,15:27,-1,15:10,-1:10,17:1" +"8,-1:5,17,-1,17:2,-1:12,66:18,-1:5,66,-1,66:3,-1:11,26,66,27,66,28,66:13,-1" +":5,66,-1,66:3,-1:11,66:4,30,66:13,-1:5,66,-1,66:3,-1:11,66:4,31,66:13,-1:5," +"66,-1,66:3,-1:11,66:4,32,66:13,-1:5,66,-1,66:3,-1:11,66:17,34,-1:5,66,-1,66" +":3,-1:11,66:13,18,66:4,-1:5,66,-1,66:3,-1:33,19,-1:7,35:28,39,35,41,35:7,-1" +":10,66:3,20,66:14,-1:5,66,-1,66:3,-1:2,44:30,47,-1,44:6,-1:10,66:7,21,66:10" +",-1:5,66,-1,66:3,-1:11,17:18,-1:7,17,-1:4,44:27,-1,44:3,40,44:6,-1:10,22,66" +":17,-1:5,66,-1,66:3,-1:11,66:14,23,66:3,-1:5,66,-1,66:3,-1:11,66:6,24,66:11" +",-1:5,66,-1,66:3,-1:11,66:13,25,66:4,-1:5,66,-1,66:3,-1:11,66:8,29,66:9,-1:" +"5,66,-1,66:3,-1:11,66:11,33,66:6,-1:5,66,-1,66:3,-1:11,66,36,66:8,60,66:7,-" +"1:5,66,-1,66:3,-1:11,66:2,42,66:15,-1:5,66,-1,66:3,-1:11,66,63,66:16,-1:5,6" +"6,-1,66:3,-1:11,66:12,45,66:5,-1:5,66,-1,66:3,-1:11,66:6,64,66:11,-1:5,66,-" +"1,66:3,-1:11,48,66:17,-1:5,66,-1,66:3,-1:11,66:5,49,66:12,-1:5,66,-1,66:3,-" +"1:11,50,66:17,-1:5,66,-1,66:3,-1:11,66:16,51,66,-1:5,66,-1,66:3,-1:11,66:7," +"52,66:10,-1:5,66,-1,66:3,-1:11,66:10,65,66:7,-1:5,66,-1,66:3,-1:11,66:7,53," +"66:10,-1:5,66,-1,66:3,-1:11,66:6,56,66:3,57,66:7,-1:5,66,-1,66:3,-1:11,66:8" +",58,66:9,-1:5,66,-1,66:3,-1:11,66:2,59,66:15,-1:5,66,-1,66:3,-1:11,66:2,61," +"66:15,-1:5,66,-1,66:3,-1:11,66:10,62,66:7,-1:5,66,-1,66:3,-1");

	public Yytoken yylex ()
		throws java.io.IOException {
		int yy_lookahead;
		int yy_anchor = YY_NO_ANCHOR;
		int yy_state = yy_state_dtrans[yy_lexical_state];
		int yy_next_state = YY_NO_STATE;
		int yy_last_accept_state = YY_NO_STATE;
		boolean yy_initial = true;
		int yy_this_accept;

		yy_mark_start();
		yy_this_accept = yy_acpt[yy_state];
		if (YY_NOT_ACCEPT != yy_this_accept) {
			yy_last_accept_state = yy_state;
			yy_mark_end();
		}
		while (true) {
			if (yy_initial && yy_at_bol) yy_lookahead = YY_BOL;
			else yy_lookahead = yy_advance();
			yy_next_state = YY_F;
			yy_next_state = yy_nxt[yy_rmap[yy_state]][yy_cmap[yy_lookahead]];
			if (YY_EOF == yy_lookahead && true == yy_initial) {

	return new Yytoken(LEX_ASM.EOF , "EOF" , yyline , yychar , yychar+1 ) ;
			}
			if (YY_F != yy_next_state) {
				yy_state = yy_next_state;
				yy_initial = false;
				yy_this_accept = yy_acpt[yy_state];
				if (YY_NOT_ACCEPT != yy_this_accept) {
					yy_last_accept_state = yy_state;
					yy_mark_end();
				}
			}
			else {
				if (YY_NO_STATE == yy_last_accept_state) {
					throw (new Error("Lexical Error: Unmatched Input."));
				}
				else {
					yy_anchor = yy_acpt[yy_last_accept_state];
					if (0 != (YY_END & yy_anchor)) {
						yy_move_end();
					}
					yy_to_mark();
					switch (yy_last_accept_state) {
					
case 1:
					
	
					
case -2:
					
	break;
					
case 2:
					
	{return new Yytoken(LEX_ASM.token_separ, yytext(), yyline, yychar, yychar+1);}
					
case -3:
					
	break;
					
case 3:
					
	{return new Yytoken(LEX_ASM.token_dpts, yytext(), yyline, yychar, yychar+1);}
					
case -4:
					
	break;
					
case 4:
					
	{return new Yytoken(LEX_ASM.token_cro, yytext(), yyline, yychar, yychar+1);}
					
case -5:
					
	break;
					
case 5:
					
	{return new Yytoken(LEX_ASM.token_crf, yytext(), yyline, yychar, yychar+1);}
					
case -6:
					
	break;
					
case 6:
					
	{return new Yytoken(LEX_ASM.token_paro, yytext(), yyline, yychar, yychar+1);}
					
case -7:
					
	break;
					
case 7:
					
	{return new Yytoken(LEX_ASM.token_parf, yytext(), yyline, yychar, yychar+1);}
					
case -8:
					
	break;
					
case 8:
					
	{return new Yytoken(LEX_ASM.token_moins, yytext(), yyline, yychar, yychar+1);}
					
case -9:
					
	break;
					
case 9:
					
	{return new Yytoken(LEX_ASM.token_aco, yytext(), yyline, yychar, yychar+1);}
					
case -10:
					
	break;
					
case 10:
					
	{return new Yytoken(LEX_ASM.token_acf, yytext(), yyline, yychar, yychar+1);}
					
case -11:
					
	break;
					
case 11:
					
	{return new Yytoken(LEX_ASM.token_ident, yytext(), yyline, yychar, yychar+1);}
					
case -12:
					
	break;
					
case 12:
					
	{return new Yytoken(LEX_ASM.token_nl, yytext(), yyline, yychar, yychar+1);}
					
case -13:
					
	break;
					
case 13:
					
	{return new Yytoken(LEX_ASM.token_autre, yytext(), yyline, yychar, yychar+1);}
					
case -14:
					
	break;
					
case 14:
					
	{return new Yytoken(LEX_ASM.token_nb, yytext(), yyline, yychar, yychar+1);}
					
case -15:
					
	break;
					
case 15:
					
	{return new Yytoken(LEX_ASM.token_info, yytext(), yyline, yychar, yychar+1);}
					
case -16:
					
	break;
					
case 16:
					
	{return new Yytoken(LEX_ASM.token_chaine, yytext(), yyline, yychar, yychar+1);}
					
case -17:
					
	break;
					
case 17:
					
	{return new Yytoken(LEX_ASM.token_var, yytext(), yyline, yychar, yychar+1);}
					
case -18:
					
	break;
					
case 18:
					
	{return new Yytoken(LEX_ASM.token_pop, yytext(), yyline, yychar, yychar+1);}
					
case -19:
					
	break;
					
case 19:
					
	{return new Yytoken(LEX_ASM.token_car, yytext(), yyline, yychar, yychar+1);}
					
case -20:
					
	break;
					
case 20:
					
	{return new Yytoken(LEX_ASM.token_load, yytext(), yyline, yychar, yychar+1);}
					
case -21:
					
	break;
					
case 21:
					
	{return new Yytoken(LEX_ASM.token_subr, yytext(), yyline, yychar, yychar+1);}
					
case -22:
					
	break;
					
case 22:
					
	{return new Yytoken(LEX_ASM.token_call, yytext(), yyline, yychar, yychar+1);}
					
case -23:
					
	break;
					
case 23:
					
	{return new Yytoken(LEX_ASM.token_push, yytext(), yyline, yychar, yychar+1);}
					
case -24:
					
	break;
					
case 24:
					
	{return new Yytoken(LEX_ASM.token_halt, yytext(), yyline, yychar, yychar+1);}
					
case -25:
					
	break;
					
case 25:
					
	{return new Yytoken(LEX_ASM.token_jump, yytext(), yyline, yychar, yychar+1);}
					
case -26:
					
	break;
					
case 26:
					
	{return new Yytoken(LEX_ASM.token_loadl, yytext(), yyline, yychar, yychar+1);}
					
case -27:
					
	break;
					
case 27:
					
	{return new Yytoken(LEX_ASM.token_loada, yytext(), yyline, yychar, yychar+1);}
					
case -28:
					
	break;
					
case 28:
					
	{return new Yytoken(LEX_ASM.token_loadi, yytext(), yyline, yychar, yychar+1);}
					
case -29:
					
	break;
					
case 29:
					
	{return new Yytoken(LEX_ASM.token_store, yytext(), yyline, yychar, yychar+1);}
					
case -30:
					
	break;
					
case 30:
					
	{return new Yytoken(LEX_ASM.token_calli, yytext(), yyline, yychar, yychar+1);}
					
case -31:
					
	break;
					
case 31:
					
	{return new Yytoken(LEX_ASM.token_jumpi, yytext(), yyline, yychar, yychar+1);}
					
case -32:
					
	break;
					
case 32:
					
	{return new Yytoken(LEX_ASM.token_storei, yytext(), yyline, yychar, yychar+1);}
					
case -33:
					
	break;
					
case 33:
					
	{return new Yytoken(LEX_ASM.token_return, yytext(), yyline, yychar, yychar+1);}
					
case -34:
					
	break;
					
case 34:
					
	{return new Yytoken(LEX_ASM.token_jumpif, yytext(), yyline, yychar, yychar+1);}
					
case -35:
					
	break;
					
case 36:
					
	{return new Yytoken(LEX_ASM.token_ident, yytext(), yyline, yychar, yychar+1);}
					
case -36:
					
	break;
					
case 37:
					
	{return new Yytoken(LEX_ASM.token_autre, yytext(), yyline, yychar, yychar+1);}
					
case -37:
					
	break;
					
case 38:
					
	{return new Yytoken(LEX_ASM.token_nb, yytext(), yyline, yychar, yychar+1);}
					
case -38:
					
	break;
					
case 39:
					
	{return new Yytoken(LEX_ASM.token_chaine, yytext(), yyline, yychar, yychar+1);}
					
case -39:
					
	break;
					
case 40:
					
	{return new Yytoken(LEX_ASM.token_car, yytext(), yyline, yychar, yychar+1);}
					
case -40:
					
	break;
					
case 42:
					
	{return new Yytoken(LEX_ASM.token_ident, yytext(), yyline, yychar, yychar+1);}
					
case -41:
					
	break;
					
case 43:
					
	{return new Yytoken(LEX_ASM.token_autre, yytext(), yyline, yychar, yychar+1);}
					
case -42:
					
	break;
					
case 45:
					
	{return new Yytoken(LEX_ASM.token_ident, yytext(), yyline, yychar, yychar+1);}
					
case -43:
					
	break;
					
case 46:
					
	{return new Yytoken(LEX_ASM.token_autre, yytext(), yyline, yychar, yychar+1);}
					
case -44:
					
	break;
					
case 48:
					
	{return new Yytoken(LEX_ASM.token_ident, yytext(), yyline, yychar, yychar+1);}
					
case -45:
					
	break;
					
case 49:
					
	{return new Yytoken(LEX_ASM.token_ident, yytext(), yyline, yychar, yychar+1);}
					
case -46:
					
	break;
					
case 50:
					
	{return new Yytoken(LEX_ASM.token_ident, yytext(), yyline, yychar, yychar+1);}
					
case -47:
					
	break;
					
case 51:
					
	{return new Yytoken(LEX_ASM.token_ident, yytext(), yyline, yychar, yychar+1);}
					
case -48:
					
	break;
					
case 52:
					
	{return new Yytoken(LEX_ASM.token_ident, yytext(), yyline, yychar, yychar+1);}
					
case -49:
					
	break;
					
case 53:
					
	{return new Yytoken(LEX_ASM.token_ident, yytext(), yyline, yychar, yychar+1);}
					
case -50:
					
	break;
					
case 54:
					
	{return new Yytoken(LEX_ASM.token_ident, yytext(), yyline, yychar, yychar+1);}
					
case -51:
					
	break;
					
case 55:
					
	{return new Yytoken(LEX_ASM.token_ident, yytext(), yyline, yychar, yychar+1);}
					
case -52:
					
	break;
					
case 56:
					
	{return new Yytoken(LEX_ASM.token_ident, yytext(), yyline, yychar, yychar+1);}
					
case -53:
					
	break;
					
case 57:
					
	{return new Yytoken(LEX_ASM.token_ident, yytext(), yyline, yychar, yychar+1);}
					
case -54:
					
	break;
					
case 58:
					
	{return new Yytoken(LEX_ASM.token_ident, yytext(), yyline, yychar, yychar+1);}
					
case -55:
					
	break;
					
case 59:
					
	{return new Yytoken(LEX_ASM.token_ident, yytext(), yyline, yychar, yychar+1);}
					
case -56:
					
	break;
					
case 60:
					
	{return new Yytoken(LEX_ASM.token_ident, yytext(), yyline, yychar, yychar+1);}
					
case -57:
					
	break;
					
case 61:
					
	{return new Yytoken(LEX_ASM.token_ident, yytext(), yyline, yychar, yychar+1);}
					
case -58:
					
	break;
					
case 62:
					
	{return new Yytoken(LEX_ASM.token_ident, yytext(), yyline, yychar, yychar+1);}
					
case -59:
					
	break;
					
case 63:
					
	{return new Yytoken(LEX_ASM.token_ident, yytext(), yyline, yychar, yychar+1);}
					
case -60:
					
	break;
					
case 64:
					
	{return new Yytoken(LEX_ASM.token_ident, yytext(), yyline, yychar, yychar+1);}
					
case -61:
					
	break;
					
case 65:
					
	{return new Yytoken(LEX_ASM.token_ident, yytext(), yyline, yychar, yychar+1);}
					
case -62:
					
	break;
					
case 66:
					
	{return new Yytoken(LEX_ASM.token_ident, yytext(), yyline, yychar, yychar+1);}
					
case -63:
					
	break;
					
case 67:
					
	{return new Yytoken(LEX_ASM.token_ident, yytext(), yyline, yychar, yychar+1);}
					
case -64:
					
	break;
					
case 68:
					
	{return new Yytoken(LEX_ASM.token_ident, yytext(), yyline, yychar, yychar+1);}
					
case -65:
					
	break;
					
case 69:
					
	{return new Yytoken(LEX_ASM.token_ident, yytext(), yyline, yychar, yychar+1);}
					
case -66:
					
	break;
					
case 70:
					
	{return new Yytoken(LEX_ASM.token_ident, yytext(), yyline, yychar, yychar+1);}
					
case -67:
					
	break;
					
case 71:
					
	{return new Yytoken(LEX_ASM.token_ident, yytext(), yyline, yychar, yychar+1);}
					
case -68:
					
	break;
					default:
						yy_error(YY_E_INTERNAL,false);
					case -1:
					}
					yy_initial = true;
					yy_state = yy_state_dtrans[yy_lexical_state];
					yy_next_state = YY_NO_STATE;
					yy_last_accept_state = YY_NO_STATE;
					yy_mark_start();
					yy_this_accept = yy_acpt[yy_state];
					if (YY_NOT_ACCEPT != yy_this_accept) {
						yy_last_accept_state = yy_state;
						yy_mark_end();
					}
				}
			}
		}
	}
}
