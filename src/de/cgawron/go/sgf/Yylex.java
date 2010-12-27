/* The following code was generated by JFlex 1.4.3 on 27.12.10 16:48 */

/**
 *
 * (C) 2010 Christian Gawron. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */
package de.cgawron.go.sgf;

import java.lang.System;
import java.io.IOException;
import java.util.logging.Logger;

import de.cgawron.util.MiscEncodingReader;



/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 27.12.10 16:48 from the specification file
 * <tt>src/de/cgawron/go/sgf/sgf.lex</tt>
 */
public class Yylex implements java_cup.runtime.Scanner, InputPosition {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int MOVE = 6;
  public static final int NODE = 4;
  public static final int TOP = 2;
  public static final int NUMBER = 12;
  public static final int LABEL = 10;
  public static final int YYINITIAL = 0;
  public static final int POINTS = 8;
  public static final int TEXT = 14;
  public static final int PROPERTY = 16;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2,  2,  3,  3,  4,  4,  5,  5,  6,  6,  7,  7, 
     8, 8
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\2\1\4\2\0\1\15\22\0\1\2\7\0\1\1\1\5"+
    "\1\0\1\12\1\0\1\12\2\0\12\13\1\11\1\3\5\0\32\16"+
    "\1\10\1\14\1\6\3\0\32\7\uff85\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\7\0\1\1\1\0\4\2\1\3\1\4\1\5\1\6"+
    "\2\3\1\1\1\7\1\3\1\10\1\11\1\12\4\3"+
    "\1\1\1\5\1\13\1\14\1\3\1\13\1\3\1\2"+
    "\1\5\1\15\2\3\1\0\1\16\2\0\1\17\6\0"+
    "\1\20\1\13\1\21\2\2\2\0\1\22\2\0\1\17"+
    "\2\0\1\23\1\24\6\0\1\25\1\26";

  private static int [] zzUnpackAction() {
    int [] result = new int[75];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\17\0\36\0\55\0\74\0\113\0\132\0\151"+
    "\0\170\0\207\0\226\0\245\0\264\0\207\0\207\0\207"+
    "\0\207\0\245\0\264\0\207\0\207\0\303\0\207\0\207"+
    "\0\207\0\322\0\341\0\360\0\377\0\u010e\0\u010e\0\u011d"+
    "\0\207\0\u012c\0\u013b\0\u014a\0\u014a\0\u014a\0\u0159\0\u0168"+
    "\0\u0177\0\226\0\207\0\245\0\264\0\207\0\u0186\0\u0195"+
    "\0\u01a4\0\u01b3\0\360\0\377\0\207\0\207\0\207\0\u01c2"+
    "\0\u01d1\0\u014a\0\u0159\0\207\0\u0168\0\u0177\0\u014a\0\u01e0"+
    "\0\u01ef\0\207\0\207\0\u01fe\0\u020d\0\u021c\0\u022b\0\u023a"+
    "\0\u0249\0\207\0\207";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[75];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\12\1\13\5\12\1\14\6\12\1\15\1\16\1\17"+
    "\1\12\1\20\1\12\1\21\1\16\1\22\5\16\1\12"+
    "\1\23\2\16\1\12\1\20\1\12\2\16\1\22\1\24"+
    "\4\16\1\12\1\23\2\16\1\12\1\20\1\12\1\16"+
    "\1\25\1\26\5\16\1\12\1\23\1\16\1\27\1\12"+
    "\1\20\1\12\1\30\1\31\1\32\1\12\4\16\1\12"+
    "\1\23\1\16\1\27\1\12\1\20\1\12\1\30\1\16"+
    "\1\33\1\12\4\16\1\12\1\23\2\16\1\12\1\20"+
    "\1\12\2\16\1\22\2\16\1\34\1\35\1\16\1\12"+
    "\1\23\3\36\1\37\1\40\1\36\1\41\5\36\1\42"+
    "\1\43\1\36\2\44\1\45\1\46\1\45\1\44\1\47"+
    "\1\50\5\44\1\45\1\51\21\0\1\52\1\53\1\52"+
    "\10\0\1\52\10\0\1\54\6\0\1\55\7\0\1\55"+
    "\1\56\5\0\1\57\7\0\1\60\6\0\1\55\7\0"+
    "\1\61\6\0\1\55\7\0\1\62\6\0\1\55\12\0"+
    "\1\63\1\64\11\0\1\65\4\0\1\64\3\0\4\36"+
    "\1\0\1\36\1\0\5\36\2\0\1\36\15\0\1\66"+
    "\1\0\4\67\1\70\10\67\1\71\1\67\4\0\1\66"+
    "\12\0\6\72\1\47\10\72\2\0\1\73\1\0\1\73"+
    "\3\0\1\74\4\0\1\73\1\0\6\72\1\47\1\75"+
    "\6\72\1\76\6\72\1\47\1\76\1\77\5\72\1\100"+
    "\7\0\1\101\1\56\5\0\1\57\6\0\1\102\1\54"+
    "\6\0\1\55\6\0\1\103\1\54\1\0\1\104\4\0"+
    "\1\55\7\0\1\54\1\0\1\105\4\0\1\55\15\0"+
    "\1\12\5\0\1\12\12\0\6\72\1\47\1\106\1\77"+
    "\5\72\1\100\7\0\1\101\1\56\15\0\1\107\7\0"+
    "\6\110\1\0\10\110\6\72\1\47\1\106\1\77\6\72"+
    "\7\0\1\111\7\0\6\110\1\112\10\110\6\0\1\113"+
    "\10\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[600];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\7\0\1\1\1\0\1\11\3\1\4\11\2\1\2\11"+
    "\1\1\3\11\7\1\1\11\10\1\1\0\1\11\2\0"+
    "\1\11\6\0\3\11\2\1\2\0\1\11\2\0\1\1"+
    "\2\0\2\11\6\0\2\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[75];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
    private static Logger logger = Logger.getLogger(Yylex.class.getName());
    
    private int level = 0;

    public int getLine()
    {
	return yyline+1;
    }

    public int getColumn()
    {
	return yycolumn+1;
    }

    public String getCurrentLine()
    {
	int beg = zzCurrentPos; 
	int end = zzCurrentPos; 
	while (beg > 0 && zzBuffer[beg-1] != '\n') beg--;
	while (end < zzEndRead && zzBuffer[end] != '\n') end++;
	
	return new String(zzBuffer, beg, end-beg);
    }


    private static Yylex theLexer = null;

    public static void setCharset(String charSetName)
    {
	if (theLexer != null)
	    theLexer._setCharset(charSetName);
    }

    public void _setCharset(String charSetName)
    {
	MiscEncodingReader mer = (MiscEncodingReader) zzReader;
	try {
	  //mer.setCharset(charSetName, zzcurrentPos);
	  mer.setCharset(charSetName, zzMarkedPos);
	  zzReader = null;
	  yyclose();
	  zzReader = mer;
	  zzAtEOF  = false;
	  zzEndRead = zzStartRead = 0;
	  zzCurrentPos = zzMarkedPos = 0;
	}
	catch (IOException err) {
	  throw new RuntimeException(err);
	}
    }


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Yylex(java.io.Reader in) {
      theLexer = this;
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public Yylex(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 52) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      logger.info("eof reached");
  yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          zzR = false;
          break;
        case '\r':
          yyline++;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
          }
          break;
        default:
          zzR = false;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 16: 
          { yybegin(TOP);
    Integer number = new Integer(yytext().substring(0, yytext().length()-1));
    return new Token(Symbols.Value, yytext(), yyline, yychar, AbstractValue.createValue(number));
          }
        case 23: break;
        case 18: 
          { return new Token(Symbols.Value, yytext(), yyline, yychar, AbstractValue.createValue(yytext()));
          }
        case 24: break;
        case 20: 
          { return new Token(Symbols.Value, yytext(), yyline, yychar, AbstractValue.createPointList(yytext().substring(0,2)));
          }
        case 25: break;
        case 13: 
          { yybegin(TOP);
    return new Token(Symbols.Value, yytext(), yyline, yychar, AbstractValue.createValue(yytext().substring(0, yytext().length()-1)));
          }
        case 26: break;
        case 7: 
          { yybegin(TOP);
    return new Token(Symbols.Value, yytext(), yyline, yychar, AbstractValue.createValue(null));
          }
        case 27: break;
        case 12: 
          { yybegin(TOP);
    return new Token(Symbols.Value, "", yyline, yychar, AbstractValue.createValue(""));
          }
        case 28: break;
        case 5: 
          { yybegin(TOP);
    return (new Token(Symbols.Semi, yytext(), yyline, yychar));
          }
        case 29: break;
        case 17: 
          { Token next = (Token) next_token();
    return new Token(Symbols.Value, yytext().substring(1) + next.m_text, yyline, yychar, AbstractValue.createValue(yytext().substring(1) + next.m_text));
          }
        case 30: break;
        case 21: 
          { return new Token(Symbols.Value, yytext(), yyline, yychar, AbstractValue.createLabel(yytext().substring(0,2), yytext().substring(3, yytext().length()-1)));
          }
        case 31: break;
        case 15: 
          { Property property = Property.createProperty(yytext().substring(0, yytext().length()-1));
    if (property instanceof Property.Move)
    {
	yybegin(MOVE);
    }
    else if (property instanceof Property.AddStones)
    {
	yybegin(POINTS);
    }
    else if (property instanceof Property.Label)
    {
        yybegin(LABEL);
    }
    else if (property instanceof Property.Markup)
    {
        yybegin(POINTS);
    }
    else if (property instanceof Property.View)
    {
        yybegin(POINTS);
    }
    else if (property instanceof Property.Text)
    {
        yybegin(TEXT);
    }
    else if (property instanceof Property.Charset)
    {
        yybegin(TEXT);
    }
    else if (property instanceof Property.Number)
    {
        yybegin(NUMBER);
    }
    else if (property instanceof Property.RootNumber)
    {
        yybegin(NUMBER);
    }
    else if (property instanceof Property.GameInfo)
    {
	yybegin(TEXT);
    }
    else
    {
	yybegin(PROPERTY);
    }
    return new Token(Symbols.Property, yytext(), yyline, yychar, property);
          }
        case 32: break;
        case 8: 
          { return (new Token(Symbols.Open, yytext(), yyline, yychar));
          }
        case 33: break;
        case 3: 
          { logger.severe(String.format("Illegal character: text=%s, line=%d, column %d, char=%d", 
				  yytext(), yyline, getColumn(), yychar));
      return new Token(Symbols.error, yytext(), yyline, yychar, null);
  //throw new ParseError("Illegal character <"+ yytext() + ">", this);
          }
        case 34: break;
        case 19: 
          { yybegin(TOP);
    return new Token(Symbols.Value, yytext(), yyline, yychar, AbstractValue.createPoint(yytext().substring(0,2)));
          }
        case 35: break;
        case 6: 
          { level--; /*if (level==0) yybegin(YYINITIAL); */ return (new Token(Symbols.Close, yytext(), yyline, yychar));
          }
        case 36: break;
        case 10: 
          { return new Token(Symbols.Value, yytext(), yyline, yychar, AbstractValue.createPointList(""));
          }
        case 37: break;
        case 9: 
          { return (new Token(Symbols.Close, yytext(), yyline, yychar));
          }
        case 38: break;
        case 11: 
          { String text = "\n";
    Token next = (Token) next_token();
    return new Token(Symbols.Value, text + next.m_text, yyline, yychar, AbstractValue.createValue(text + next.m_text));
          }
        case 39: break;
        case 4: 
          { level++; return (new Token(Symbols.Open, yytext(), yyline, yychar));
          }
        case 40: break;
        case 1: 
          { String text = yytext();
    Token next = (Token) next_token();
    return new Token(Symbols.Value, text + next.m_text, yyline, yychar, AbstractValue.createValue(text + next.m_text));
          }
        case 41: break;
        case 22: 
          { return new Token(Symbols.Value, yytext(), yyline, yychar, AbstractValue.createPointList(yytext().substring(0,5)));
          }
        case 42: break;
        case 14: 
          // lookahead expression with fixed base length
          zzMarkedPos = zzStartRead + 1;
          { yybegin(TOP);
    level++;
    return (new Token(Symbols.Open, yytext(), yyline, yychar));
          }
        case 43: break;
        case 2: 
          { 
          }
        case 44: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
            return null;
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
