/* The following code was generated by JFlex 1.4.3 on 11/10/11 3:26 PM */

package org.jetbrains.jet.lexer;

import java.util.*;
import com.intellij.lexer.*;
import com.intellij.psi.*;
import com.intellij.psi.tree.IElementType;

import org.jetbrains.jet.lexer.JetTokens;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 11/10/11 3:26 PM from the specification file
 * <tt>/Users/yozh/devel/jb/jet/compiler/frontend/src/org/jetbrains/jet/lexer/Jet.flex</tt>
 */
class _JetLexer implements FlexLexer {
  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int STRING = 2;
  public static final int YYINITIAL = 0;
  public static final int LONG_TEMPLATE_ENTRY = 6;
  public static final int SHORT_TEMPLATE_ENTRY = 4;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2,  2,  3, 3
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\3\1\13\1\0\1\3\23\0\1\3\1\57\1\25\1\77"+
    "\1\7\1\67\1\65\1\23\1\72\1\73\1\12\1\62\1\76\1\21"+
    "\1\17\1\11\1\14\11\1\1\74\1\75\1\63\1\60\1\64\1\61"+
    "\1\10\1\2\1\16\2\2\1\20\1\2\11\4\1\22\3\4\1\54"+
    "\3\4\1\15\2\4\1\70\1\24\1\71\1\0\1\4\1\6\1\31"+
    "\1\44\1\36\1\56\1\33\1\52\1\4\1\47\1\41\1\45\1\51"+
    "\1\50\1\32\1\30\1\37\1\35\1\4\1\43\1\34\1\40\1\42"+
    "\1\55\1\46\1\15\1\53\1\4\1\26\1\66\1\27\54\0\1\4"+
    "\12\0\1\4\4\0\1\4\5\0\27\4\1\0\37\4\1\0\u013f\4"+
    "\31\0\162\4\4\0\14\4\16\0\5\4\11\0\1\4\213\0\1\4"+
    "\13\0\1\4\1\0\3\4\1\0\1\4\1\0\24\4\1\0\54\4"+
    "\1\0\46\4\1\0\5\4\4\0\202\4\10\0\105\4\1\0\46\4"+
    "\2\0\2\4\6\0\20\4\41\0\46\4\2\0\1\4\7\0\47\4"+
    "\110\0\33\4\5\0\3\4\56\0\32\4\5\0\13\4\25\0\12\5"+
    "\4\0\2\4\1\0\143\4\1\0\1\4\17\0\2\4\7\0\2\4"+
    "\12\5\3\4\2\0\1\4\20\0\1\4\1\0\36\4\35\0\3\4"+
    "\60\0\46\4\13\0\1\4\u0152\0\66\4\3\0\1\4\22\0\1\4"+
    "\7\0\12\4\4\0\12\5\25\0\10\4\2\0\2\4\2\0\26\4"+
    "\1\0\7\4\1\0\1\4\3\0\4\4\3\0\1\4\36\0\2\4"+
    "\1\0\3\4\4\0\12\5\2\4\23\0\6\4\4\0\2\4\2\0"+
    "\26\4\1\0\7\4\1\0\2\4\1\0\2\4\1\0\2\4\37\0"+
    "\4\4\1\0\1\4\7\0\12\5\2\0\3\4\20\0\11\4\1\0"+
    "\3\4\1\0\26\4\1\0\7\4\1\0\2\4\1\0\5\4\3\0"+
    "\1\4\22\0\1\4\17\0\2\4\4\0\12\5\25\0\10\4\2\0"+
    "\2\4\2\0\26\4\1\0\7\4\1\0\2\4\1\0\5\4\3\0"+
    "\1\4\36\0\2\4\1\0\3\4\4\0\12\5\1\0\1\4\21\0"+
    "\1\4\1\0\6\4\3\0\3\4\1\0\4\4\3\0\2\4\1\0"+
    "\1\4\1\0\2\4\3\0\2\4\3\0\3\4\3\0\10\4\1\0"+
    "\3\4\55\0\11\5\25\0\10\4\1\0\3\4\1\0\27\4\1\0"+
    "\12\4\1\0\5\4\46\0\2\4\4\0\12\5\25\0\10\4\1\0"+
    "\3\4\1\0\27\4\1\0\12\4\1\0\5\4\3\0\1\4\40\0"+
    "\1\4\1\0\2\4\4\0\12\5\25\0\10\4\1\0\3\4\1\0"+
    "\27\4\1\0\20\4\46\0\2\4\4\0\12\5\25\0\22\4\3\0"+
    "\30\4\1\0\11\4\1\0\1\4\2\0\7\4\72\0\60\4\1\0"+
    "\2\4\14\0\7\4\11\0\12\5\47\0\2\4\1\0\1\4\2\0"+
    "\2\4\1\0\1\4\2\0\1\4\6\0\4\4\1\0\7\4\1\0"+
    "\3\4\1\0\1\4\1\0\1\4\2\0\2\4\1\0\4\4\1\0"+
    "\2\4\11\0\1\4\2\0\5\4\1\0\1\4\11\0\12\5\2\0"+
    "\2\4\42\0\1\4\37\0\12\5\26\0\10\4\1\0\42\4\35\0"+
    "\4\4\164\0\42\4\1\0\5\4\1\0\2\4\25\0\12\5\6\0"+
    "\6\4\112\0\46\4\12\0\51\4\7\0\132\4\5\0\104\4\5\0"+
    "\122\4\6\0\7\4\1\0\77\4\1\0\1\4\1\0\4\4\2\0"+
    "\7\4\1\0\1\4\1\0\4\4\2\0\47\4\1\0\1\4\1\0"+
    "\4\4\2\0\37\4\1\0\1\4\1\0\4\4\2\0\7\4\1\0"+
    "\1\4\1\0\4\4\2\0\7\4\1\0\7\4\1\0\27\4\1\0"+
    "\37\4\1\0\1\4\1\0\4\4\2\0\7\4\1\0\47\4\1\0"+
    "\23\4\16\0\11\5\56\0\125\4\14\0\u026c\4\2\0\10\4\12\0"+
    "\32\4\5\0\113\4\25\0\15\4\1\0\4\4\16\0\22\4\16\0"+
    "\22\4\16\0\15\4\1\0\3\4\17\0\64\4\43\0\1\4\4\0"+
    "\1\4\3\0\12\5\46\0\12\5\6\0\130\4\10\0\51\4\127\0"+
    "\35\4\51\0\12\5\36\4\2\0\5\4\u038b\0\154\4\224\0\234\4"+
    "\4\0\132\4\6\0\26\4\2\0\6\4\2\0\46\4\2\0\6\4"+
    "\2\0\10\4\1\0\1\4\1\0\1\4\1\0\1\4\1\0\37\4"+
    "\2\0\65\4\1\0\7\4\1\0\1\4\3\0\3\4\1\0\7\4"+
    "\3\0\4\4\2\0\6\4\4\0\15\4\5\0\3\4\1\0\7\4"+
    "\164\0\1\4\15\0\1\4\202\0\1\4\4\0\1\4\2\0\12\4"+
    "\1\0\1\4\3\0\5\4\6\0\1\4\1\0\1\4\1\0\1\4"+
    "\1\0\4\4\1\0\3\4\1\0\7\4\3\0\3\4\5\0\5\4"+
    "\u0ebb\0\2\4\52\0\5\4\5\0\2\4\4\0\126\4\6\0\3\4"+
    "\1\0\132\4\1\0\4\4\5\0\50\4\4\0\136\4\21\0\30\4"+
    "\70\0\20\4\u0200\0\u19b6\4\112\0\u51a6\4\132\0\u048d\4\u0773\0\u2ba4\4"+
    "\u215c\0\u012e\4\2\0\73\4\225\0\7\4\14\0\5\4\5\0\1\4"+
    "\1\0\12\4\1\0\15\4\1\0\5\4\1\0\1\4\1\0\2\4"+
    "\1\0\2\4\1\0\154\4\41\0\u016b\4\22\0\100\4\2\0\66\4"+
    "\50\0\14\4\164\0\5\4\1\0\207\4\23\0\12\5\7\0\32\4"+
    "\6\0\32\4\13\0\131\4\3\0\6\4\2\0\6\4\2\0\6\4"+
    "\2\0\3\4\43\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\4\0\1\1\1\2\1\3\1\4\2\1\1\5\1\6"+
    "\1\7\1\2\1\10\1\11\1\12\1\13\1\14\1\15"+
    "\17\3\1\16\1\17\1\20\1\21\1\22\1\23\2\1"+
    "\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33"+
    "\1\34\2\35\1\36\1\0\1\37\1\40\1\0\1\41"+
    "\1\42\1\0\1\43\1\0\1\44\1\0\1\45\1\0"+
    "\1\46\1\47\1\50\1\51\1\52\1\43\2\2\1\43"+
    "\1\53\1\54\1\55\1\56\2\12\1\0\2\3\1\57"+
    "\10\3\1\60\1\61\1\62\10\3\1\63\1\0\1\64"+
    "\1\65\1\66\1\67\1\70\1\71\1\72\1\73\1\74"+
    "\1\75\1\76\1\0\1\77\1\100\1\0\1\101\1\43"+
    "\1\3\2\0\1\50\1\102\4\0\1\103\2\3\1\104"+
    "\7\3\1\105\10\3\1\106\1\107\1\3\1\110\1\111"+
    "\1\112\1\113\1\114\1\115\1\0\1\40\1\44\1\45"+
    "\1\0\2\102\1\43\2\0\1\3\1\116\1\117\5\3"+
    "\1\120\1\121\1\3\1\122\2\3\1\123\2\3\1\124"+
    "\1\125\1\76\1\50\2\0\1\3\1\126\1\3\1\127"+
    "\1\3\1\130\1\131\1\3\1\132\1\133\1\134\1\103"+
    "\2\3\1\135\1\136\3\3\1\137\1\140";

  private static int [] zzUnpackAction() {
    int [] result = new int[217];
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
    "\0\0\0\100\0\200\0\300\0\u0100\0\u0140\0\u0180\0\u01c0"+
    "\0\u0200\0\u0240\0\u0280\0\u02c0\0\u0300\0\u0340\0\u0380\0\u03c0"+
    "\0\u0400\0\u0440\0\u0100\0\u0100\0\u0480\0\u04c0\0\u0500\0\u0540"+
    "\0\u0580\0\u05c0\0\u0600\0\u0640\0\u0680\0\u06c0\0\u0700\0\u0740"+
    "\0\u0780\0\u07c0\0\u0800\0\u0840\0\u0880\0\u0100\0\u08c0\0\u0900"+
    "\0\u0940\0\u0980\0\u09c0\0\u0a00\0\u0100\0\u0100\0\u0100\0\u0100"+
    "\0\u0100\0\u0100\0\u0100\0\u0100\0\u0a40\0\u0a80\0\u0100\0\u0ac0"+
    "\0\u0100\0\u0b00\0\u0b40\0\u0100\0\u0100\0\u0b80\0\u0bc0\0\u0c00"+
    "\0\u0c40\0\u0c80\0\u0cc0\0\u0d00\0\u0100\0\u0d40\0\u0d80\0\u0100"+
    "\0\u0100\0\u0dc0\0\u0e00\0\u0e40\0\u0e80\0\u0100\0\u0100\0\u0100"+
    "\0\u0100\0\u0100\0\u0ec0\0\u0f00\0\u0f40\0\u0f80\0\u0fc0\0\u1000"+
    "\0\u1040\0\u1080\0\u10c0\0\u1100\0\u1140\0\u1180\0\u11c0\0\u0180"+
    "\0\u0180\0\u0180\0\u1200\0\u1240\0\u1280\0\u12c0\0\u1300\0\u1340"+
    "\0\u1380\0\u13c0\0\u0180\0\u1400\0\u1440\0\u1480\0\u0100\0\u0100"+
    "\0\u0100\0\u0100\0\u0100\0\u0100\0\u0100\0\u0100\0\u14c0\0\u1500"+
    "\0\u0100\0\u0100\0\u1540\0\u0100\0\u1580\0\u0100\0\u15c0\0\u1600"+
    "\0\u1640\0\u1680\0\u16c0\0\u1700\0\u1740\0\u1780\0\u17c0\0\u1800"+
    "\0\u1840\0\u0100\0\u1880\0\u18c0\0\u1900\0\u1940\0\u1980\0\u19c0"+
    "\0\u1a00\0\u0180\0\u1a40\0\u1a80\0\u1ac0\0\u1b00\0\u1b40\0\u1b80"+
    "\0\u1bc0\0\u1c00\0\u0180\0\u0180\0\u1c40\0\u0180\0\u0180\0\u1c80"+
    "\0\u1c80\0\u0100\0\u0100\0\u1cc0\0\u0100\0\u0100\0\u0100\0\u1d00"+
    "\0\u1d40\0\u0100\0\u1d80\0\u1580\0\u1dc0\0\u1e00\0\u0180\0\u0180"+
    "\0\u1e40\0\u1e80\0\u1ec0\0\u1f00\0\u1f40\0\u0180\0\u0180\0\u1f80"+
    "\0\u0180\0\u1fc0\0\u2000\0\u0180\0\u2040\0\u2080\0\u0180\0\u0100"+
    "\0\u0100\0\u0100\0\u20c0\0\u2100\0\u2140\0\u0180\0\u2180\0\u0180"+
    "\0\u21c0\0\u0180\0\u0180\0\u2200\0\u0180\0\u0180\0\u0180\0\u0100"+
    "\0\u2240\0\u2280\0\u0180\0\u0180\0\u22c0\0\u2300\0\u2340\0\u0180"+
    "\0\u0180";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[217];
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
    "\1\5\1\6\1\7\1\10\1\7\1\5\1\11\1\12"+
    "\1\13\1\14\1\15\1\10\1\16\2\7\1\17\1\7"+
    "\1\20\1\7\1\21\1\5\1\22\1\23\1\24\1\25"+
    "\1\26\1\7\1\27\1\30\1\7\1\31\1\32\1\33"+
    "\1\34\1\7\1\35\1\36\1\7\1\37\3\7\1\40"+
    "\1\7\1\41\1\42\1\43\1\44\1\45\1\46\1\47"+
    "\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57"+
    "\1\60\1\61\1\62\1\63\1\64\7\65\1\66\3\65"+
    "\1\67\10\65\1\70\1\71\52\65\2\0\1\72\1\0"+
    "\1\72\1\0\1\73\6\0\2\72\1\0\1\72\1\0"+
    "\1\72\5\0\27\72\21\0\1\5\1\6\1\7\1\10"+
    "\1\7\1\5\1\11\1\12\1\13\1\14\1\15\1\10"+
    "\1\16\2\7\1\17\1\7\1\20\1\7\1\21\1\5"+
    "\1\22\1\74\1\75\1\25\1\26\1\7\1\27\1\30"+
    "\1\7\1\31\1\32\1\33\1\34\1\7\1\35\1\36"+
    "\1\7\1\37\3\7\1\40\1\7\1\41\1\42\1\43"+
    "\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53"+
    "\1\54\1\55\1\56\1\57\1\60\1\61\1\62\1\63"+
    "\1\64\101\0\1\6\12\0\1\6\2\0\1\76\1\77"+
    "\12\0\1\77\45\0\2\7\1\0\2\7\6\0\3\7"+
    "\1\0\1\7\1\0\1\7\5\0\27\7\24\0\1\10"+
    "\7\0\1\10\66\0\1\100\1\0\1\100\10\0\2\100"+
    "\1\0\1\100\1\0\1\100\5\0\27\100\23\0\1\101"+
    "\1\0\1\101\1\0\1\102\6\0\2\101\1\0\1\101"+
    "\1\0\1\101\5\0\27\101\23\0\1\103\1\0\1\103"+
    "\1\0\1\104\1\0\1\105\4\0\2\103\1\0\1\103"+
    "\1\0\1\103\5\0\27\103\32\0\1\106\1\107\45\0"+
    "\1\110\77\0\1\111\20\0\1\112\12\0\1\112\1\113"+
    "\1\114\1\76\1\77\12\0\1\77\10\0\1\114\34\0"+
    "\1\115\12\0\1\115\2\0\1\116\101\0\1\117\36\0"+
    "\1\120\3\0\1\121\13\0\13\21\1\0\7\21\1\122"+
    "\1\123\53\21\25\0\1\124\53\0\2\7\1\0\2\7"+
    "\6\0\3\7\1\0\1\7\1\0\1\7\5\0\1\7"+
    "\1\125\10\7\1\126\14\7\22\0\2\7\1\0\2\7"+
    "\6\0\3\7\1\0\1\7\1\0\1\7\5\0\4\7"+
    "\1\127\22\7\22\0\2\7\1\0\2\7\6\0\3\7"+
    "\1\0\1\7\1\0\1\7\5\0\20\7\1\130\6\7"+
    "\22\0\2\7\1\0\2\7\6\0\3\7\1\0\1\7"+
    "\1\0\1\7\5\0\12\7\1\131\14\7\22\0\2\7"+
    "\1\0\2\7\6\0\3\7\1\0\1\7\1\0\1\7"+
    "\5\0\7\7\1\132\10\7\1\133\6\7\22\0\2\7"+
    "\1\0\2\7\6\0\3\7\1\0\1\7\1\0\1\7"+
    "\5\0\14\7\1\134\12\7\22\0\2\7\1\0\2\7"+
    "\6\0\3\7\1\0\1\7\1\0\1\7\5\0\13\7"+
    "\1\135\3\7\1\136\3\7\1\137\3\7\22\0\2\7"+
    "\1\0\2\7\6\0\3\7\1\0\1\7\1\0\1\7"+
    "\5\0\1\140\3\7\1\141\15\7\1\142\4\7\22\0"+
    "\2\7\1\0\2\7\6\0\3\7\1\0\1\7\1\0"+
    "\1\7\5\0\3\7\1\143\23\7\22\0\2\7\1\0"+
    "\2\7\6\0\3\7\1\0\1\7\1\0\1\7\5\0"+
    "\13\7\1\144\13\7\22\0\2\7\1\0\2\7\6\0"+
    "\3\7\1\0\1\7\1\0\1\7\5\0\17\7\1\145"+
    "\7\7\22\0\2\7\1\0\2\7\6\0\3\7\1\0"+
    "\1\7\1\0\1\7\5\0\1\7\1\146\5\7\1\147"+
    "\2\7\1\150\14\7\22\0\2\7\1\0\2\7\6\0"+
    "\3\7\1\0\1\7\1\0\1\7\5\0\17\7\1\151"+
    "\7\7\22\0\2\7\1\0\2\7\6\0\3\7\1\0"+
    "\1\7\1\0\1\7\5\0\1\7\1\152\25\7\22\0"+
    "\2\7\1\0\2\7\6\0\3\7\1\0\1\7\1\0"+
    "\1\7\5\0\7\7\1\153\17\7\62\0\1\154\16\0"+
    "\1\155\77\0\1\156\3\0\1\157\73\0\1\160\1\0"+
    "\1\161\75\0\1\162\77\0\1\163\104\0\1\164\100\0"+
    "\1\165\71\0\1\166\17\0\7\65\1\0\3\65\1\0"+
    "\10\65\2\0\52\65\2\0\1\167\1\0\1\167\1\0"+
    "\1\170\6\0\2\167\1\0\1\167\1\0\1\167\3\0"+
    "\1\171\1\0\27\167\21\0\13\172\1\0\64\172\1\0"+
    "\2\72\1\0\2\72\6\0\3\72\1\0\1\72\1\0"+
    "\1\72\5\0\27\72\23\0\1\173\1\0\1\173\10\0"+
    "\2\173\1\0\1\173\1\0\1\173\5\0\27\173\22\0"+
    "\1\115\12\0\1\115\2\0\1\174\61\0\1\175\12\0"+
    "\1\175\4\0\1\175\40\0\1\175\16\0\2\100\1\0"+
    "\2\100\1\176\5\0\3\100\1\0\1\100\1\0\1\100"+
    "\5\0\27\100\22\0\2\101\1\0\2\101\6\0\3\101"+
    "\1\0\1\101\1\0\1\101\5\0\27\101\23\0\1\177"+
    "\1\0\1\177\10\0\2\177\1\0\1\177\1\0\1\177"+
    "\5\0\27\177\22\0\2\103\1\0\2\103\6\0\3\103"+
    "\1\0\1\103\1\0\1\103\5\0\27\103\23\0\1\200"+
    "\1\0\1\200\10\0\2\200\1\0\1\200\1\0\1\200"+
    "\5\0\27\200\21\0\13\106\1\0\64\106\12\201\1\202"+
    "\65\201\1\0\1\112\12\0\1\112\2\0\1\203\1\77"+
    "\12\0\1\77\45\0\2\113\11\0\1\113\1\0\1\113"+
    "\1\204\1\113\1\0\1\205\6\0\1\113\1\0\1\113"+
    "\1\0\1\205\1\113\5\0\1\113\5\0\1\113\3\0"+
    "\1\113\22\0\1\114\12\0\1\114\2\0\1\206\61\0"+
    "\1\115\12\0\1\115\3\0\1\77\12\0\1\77\44\0"+
    "\13\21\1\0\64\21\25\0\1\207\53\0\2\7\1\0"+
    "\2\7\6\0\3\7\1\0\1\7\1\0\1\7\5\0"+
    "\2\7\1\210\24\7\22\0\2\7\1\0\2\7\6\0"+
    "\3\7\1\0\1\7\1\0\1\7\5\0\20\7\1\211"+
    "\6\7\22\0\2\7\1\0\2\7\6\0\3\7\1\0"+
    "\1\7\1\0\1\7\5\0\27\7\2\0\1\212\17\0"+
    "\2\7\1\0\2\7\6\0\3\7\1\0\1\7\1\0"+
    "\1\7\5\0\4\7\1\213\22\7\22\0\2\7\1\0"+
    "\2\7\6\0\3\7\1\0\1\7\1\0\1\7\5\0"+
    "\5\7\1\214\21\7\22\0\2\7\1\0\2\7\6\0"+
    "\3\7\1\0\1\7\1\0\1\7\5\0\1\215\26\7"+
    "\22\0\2\7\1\0\2\7\6\0\3\7\1\0\1\7"+
    "\1\0\1\7\5\0\1\7\1\216\25\7\22\0\2\7"+
    "\1\0\2\7\6\0\3\7\1\0\1\7\1\0\1\7"+
    "\5\0\15\7\1\217\11\7\22\0\2\7\1\0\2\7"+
    "\6\0\3\7\1\0\1\7\1\0\1\7\5\0\1\7"+
    "\1\220\10\7\1\221\10\7\1\222\3\7\22\0\2\7"+
    "\1\0\2\7\6\0\3\7\1\0\1\7\1\0\1\7"+
    "\5\0\11\7\1\223\1\7\1\224\13\7\22\0\2\7"+
    "\1\0\2\7\6\0\3\7\1\0\1\7\1\0\1\7"+
    "\5\0\5\7\1\225\21\7\22\0\2\7\1\0\2\7"+
    "\6\0\3\7\1\0\1\7\1\0\1\7\5\0\10\7"+
    "\1\226\16\7\22\0\2\7\1\0\2\7\6\0\3\7"+
    "\1\0\1\7\1\0\1\7\5\0\3\7\1\227\23\7"+
    "\22\0\2\7\1\0\2\7\6\0\3\7\1\0\1\7"+
    "\1\0\1\7\5\0\3\7\1\230\5\7\1\231\15\7"+
    "\22\0\2\7\1\0\2\7\6\0\3\7\1\0\1\7"+
    "\1\0\1\7\5\0\20\7\1\232\6\7\22\0\2\7"+
    "\1\0\2\7\6\0\3\7\1\0\1\7\1\0\1\7"+
    "\5\0\13\7\1\233\13\7\22\0\2\7\1\0\2\7"+
    "\6\0\3\7\1\0\1\7\1\0\1\7\5\0\1\234"+
    "\26\7\22\0\2\7\1\0\2\7\6\0\3\7\1\0"+
    "\1\7\1\0\1\7\5\0\11\7\1\235\15\7\22\0"+
    "\2\7\1\0\2\7\6\0\3\7\1\0\1\7\1\0"+
    "\1\7\5\0\13\7\1\236\4\7\1\237\6\7\51\0"+
    "\1\240\3\0\1\241\123\0\1\242\77\0\1\243\20\0"+
    "\2\167\1\0\2\167\6\0\3\167\1\0\1\167\1\0"+
    "\1\167\5\0\27\167\23\0\1\244\1\0\1\244\10\0"+
    "\2\244\1\0\1\244\1\0\1\244\5\0\27\244\22\0"+
    "\2\173\1\0\2\173\1\245\5\0\3\173\1\0\1\173"+
    "\1\0\1\173\5\0\27\173\22\0\1\175\12\0\1\175"+
    "\64\0\2\177\1\0\2\177\1\246\5\0\3\177\1\0"+
    "\1\177\1\0\1\177\5\0\27\177\22\0\2\200\1\0"+
    "\2\200\1\247\5\0\3\200\1\0\1\200\1\0\1\200"+
    "\5\0\27\200\21\0\12\201\1\250\65\201\11\251\1\252"+
    "\1\202\65\251\1\0\1\115\12\0\1\115\64\0\2\253"+
    "\11\0\1\253\1\0\1\253\1\174\1\253\10\0\1\253"+
    "\1\0\1\253\2\0\1\253\5\0\1\253\5\0\1\253"+
    "\3\0\1\253\22\0\1\175\12\0\1\175\4\0\1\254"+
    "\40\0\1\254\34\0\1\174\60\0\25\207\1\255\52\207"+
    "\1\0\2\7\1\0\2\7\6\0\3\7\1\0\1\7"+
    "\1\0\1\7\5\0\3\7\1\256\23\7\22\0\2\7"+
    "\1\0\2\7\6\0\3\7\1\0\1\7\1\0\1\7"+
    "\5\0\20\7\1\257\6\7\22\0\2\7\1\0\2\7"+
    "\6\0\3\7\1\0\1\7\1\0\1\7\5\0\3\7"+
    "\1\260\23\7\22\0\2\7\1\0\2\7\6\0\3\7"+
    "\1\0\1\7\1\0\1\7\5\0\3\7\1\261\23\7"+
    "\22\0\2\7\1\0\2\7\6\0\3\7\1\0\1\7"+
    "\1\0\1\7\5\0\10\7\1\262\16\7\22\0\2\7"+
    "\1\0\2\7\6\0\3\7\1\0\1\7\1\0\1\7"+
    "\5\0\4\7\1\263\22\7\22\0\2\7\1\0\2\7"+
    "\6\0\3\7\1\0\1\7\1\0\1\7\5\0\3\7"+
    "\1\264\23\7\22\0\2\7\1\0\2\7\6\0\3\7"+
    "\1\0\1\7\1\0\1\7\5\0\11\7\1\265\15\7"+
    "\22\0\2\7\1\0\2\7\6\0\3\7\1\0\1\7"+
    "\1\0\1\7\5\0\3\7\1\266\23\7\22\0\2\7"+
    "\1\0\2\7\6\0\3\7\1\0\1\7\1\0\1\7"+
    "\5\0\4\7\1\267\22\7\22\0\2\7\1\0\2\7"+
    "\6\0\3\7\1\0\1\7\1\0\1\7\5\0\7\7"+
    "\1\270\17\7\22\0\2\7\1\0\2\7\6\0\3\7"+
    "\1\0\1\7\1\0\1\7\5\0\3\7\1\271\23\7"+
    "\22\0\2\7\1\0\2\7\6\0\3\7\1\0\1\7"+
    "\1\0\1\7\5\0\12\7\1\272\14\7\22\0\2\7"+
    "\1\0\2\7\6\0\3\7\1\0\1\7\1\0\1\7"+
    "\5\0\1\7\1\273\25\7\22\0\2\7\1\0\2\7"+
    "\6\0\3\7\1\0\1\7\1\0\1\7\5\0\1\274"+
    "\26\7\22\0\2\7\1\0\2\7\6\0\3\7\1\0"+
    "\1\7\1\0\1\7\5\0\20\7\1\275\6\7\22\0"+
    "\2\7\1\0\2\7\6\0\3\7\1\0\1\7\1\0"+
    "\1\7\5\0\4\7\1\276\22\7\22\0\2\7\1\0"+
    "\2\7\6\0\3\7\1\0\1\7\1\0\1\7\5\0"+
    "\4\7\1\277\22\7\22\0\2\300\1\0\2\300\6\0"+
    "\3\300\1\0\1\300\1\0\1\300\5\0\27\300\22\0"+
    "\2\244\1\0\2\244\1\301\5\0\3\244\1\0\1\244"+
    "\1\0\1\244\5\0\27\244\21\0\11\201\1\302\1\250"+
    "\65\201\12\251\1\303\65\251\1\0\2\253\11\0\1\253"+
    "\1\0\1\253\1\0\1\253\1\0\1\205\6\0\1\253"+
    "\1\0\1\253\1\0\1\205\1\253\5\0\1\253\5\0"+
    "\1\253\3\0\1\253\21\0\25\207\1\304\52\207\1\0"+
    "\2\7\1\0\2\7\6\0\3\7\1\0\1\7\1\0"+
    "\1\7\5\0\4\7\1\305\22\7\22\0\2\7\1\0"+
    "\2\7\6\0\3\7\1\0\1\7\1\0\1\7\5\0"+
    "\13\7\1\306\13\7\22\0\2\7\1\0\2\7\6\0"+
    "\3\7\1\0\1\7\1\0\1\7\5\0\11\7\1\307"+
    "\15\7\22\0\2\7\1\0\2\7\6\0\3\7\1\0"+
    "\1\7\1\0\1\7\5\0\4\7\1\310\22\7\22\0"+
    "\2\7\1\0\2\7\6\0\3\7\1\0\1\7\1\0"+
    "\1\7\5\0\6\7\1\311\20\7\22\0\2\7\1\0"+
    "\2\7\6\0\3\7\1\0\1\7\1\0\1\7\5\0"+
    "\10\7\1\312\16\7\22\0\2\7\1\0\2\7\6\0"+
    "\3\7\1\0\1\7\1\0\1\7\5\0\16\7\1\313"+
    "\10\7\22\0\2\7\1\0\2\7\6\0\3\7\1\0"+
    "\1\7\1\0\1\7\5\0\13\7\1\314\13\7\22\0"+
    "\2\7\1\0\2\7\6\0\3\7\1\0\1\7\1\0"+
    "\1\7\5\0\21\7\1\315\5\7\22\0\2\7\1\0"+
    "\2\7\6\0\3\7\1\0\1\7\1\0\1\7\5\0"+
    "\3\7\1\316\23\7\22\0\2\7\1\0\2\7\6\0"+
    "\3\7\1\0\1\7\1\0\1\7\5\0\3\7\1\317"+
    "\23\7\21\0\11\251\1\252\1\303\65\251\25\207\1\320"+
    "\52\207\1\0\2\7\1\0\2\7\6\0\3\7\1\0"+
    "\1\7\1\0\1\7\5\0\5\7\1\321\21\7\22\0"+
    "\2\7\1\0\2\7\6\0\3\7\1\0\1\7\1\0"+
    "\1\7\5\0\1\322\26\7\22\0\2\7\1\0\2\7"+
    "\6\0\3\7\1\0\1\7\1\0\1\7\5\0\10\7"+
    "\1\323\16\7\22\0\2\7\1\0\2\7\6\0\3\7"+
    "\1\0\1\7\1\0\1\7\5\0\1\324\26\7\22\0"+
    "\2\7\1\0\2\7\6\0\3\7\1\0\1\7\1\0"+
    "\1\7\5\0\1\7\1\325\25\7\22\0\2\7\1\0"+
    "\2\7\6\0\3\7\1\0\1\7\1\0\1\7\5\0"+
    "\12\7\1\326\14\7\22\0\2\7\1\0\2\7\6\0"+
    "\3\7\1\0\1\7\1\0\1\7\5\0\6\7\1\327"+
    "\20\7\22\0\2\7\1\0\2\7\6\0\3\7\1\0"+
    "\1\7\1\0\1\7\5\0\3\7\1\330\23\7\22\0"+
    "\2\7\1\0\2\7\6\0\3\7\1\0\1\7\1\0"+
    "\1\7\5\0\3\7\1\331\23\7\21\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[9088];
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
  private static final char[] EMPTY_BUFFER = new char[0];
  private static final int YYEOF = -1;
  private static java.io.Reader zzReader = null; // Fake

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
    "\4\0\1\11\15\1\2\11\21\1\1\11\6\1\10\11"+
    "\2\1\1\11\1\0\1\11\1\1\1\0\2\11\1\0"+
    "\1\1\1\0\1\1\1\0\1\1\1\0\1\11\2\1"+
    "\2\11\4\1\5\11\1\1\1\0\27\1\1\0\2\1"+
    "\10\11\1\1\1\0\2\11\1\0\1\11\1\1\1\11"+
    "\2\0\2\1\4\0\3\1\1\11\27\1\2\11\1\0"+
    "\3\11\1\0\1\1\1\11\1\1\2\0\22\1\3\11"+
    "\2\0\13\1\1\11\11\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[217];
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

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** this buffer may contains the current text array to be matched when it is cheap to acquire it */
  private char[] zzBufferArray;

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the textposition at the last state to be included in yytext */
  private int zzPushbackPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
    private static final class State {
        final int lBraceCount;
        final int state;

        public State(int state, int lBraceCount) {
            this.state = state;
            this.lBraceCount = lBraceCount;
        }
    }

    private final Stack<State> states = new Stack<State>();
    private int lBraceCount;

    private void pushState(int state) {
        states.push(new State(yystate(), lBraceCount));
        lBraceCount = 0;
        yybegin(state);
    }

    private void popState() {
        State state = states.pop();
        lBraceCount = state.lBraceCount;
        yybegin(state.state);
    }


  _JetLexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  _JetLexer(java.io.InputStream in) {
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
    while (i < 1326) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart(){
    return zzStartRead;
  }

  public final int getTokenEnd(){
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end,int initialState){
    zzBuffer = buffer;
    zzBufferArray = com.intellij.util.text.CharArrayUtil.fromSequenceWithoutCopying(buffer);
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzPushbackPos = 0;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
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
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
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
    return zzBufferArray != null ? zzBufferArray[zzStartRead+pos]:zzBuffer.charAt(zzStartRead+pos);
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
  private void zzDoEOF() {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;
    char[] zzBufferArrayL = zzBufferArray;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferArrayL != null ? zzBufferArrayL[zzCurrentPosL++]:zzBufferL.charAt(zzCurrentPosL++);
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
              zzInput = zzBufferArrayL != null ? zzBufferArrayL[zzCurrentPosL++]:zzBufferL.charAt(zzCurrentPosL++);
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
        case 3: 
          { return JetTokens.IDENTIFIER;
          }
        case 97: break;
        case 11: 
          { pushState(STRING); return JetTokens.OPEN_QUOTE;
          }
        case 98: break;
        case 70: 
          { return JetTokens.FOR_KEYWORD ;
          }
        case 99: break;
        case 94: 
          { return JetTokens.RETURN_KEYWORD ;
          }
        case 100: break;
        case 78: 
          { return JetTokens.NULL_KEYWORD ;
          }
        case 101: break;
        case 34: 
          { if (lBraceCount == 0) {
                                             popState();
                                             return JetTokens.LONG_TEMPLATE_ENTRY_END;
                                           }
                                           lBraceCount--;
                                           return JetTokens.RBRACE;
          }
        case 102: break;
        case 18: 
          { return JetTokens.LT        ;
          }
        case 103: break;
        case 51: 
          { return JetTokens.DO_KEYWORD ;
          }
        case 104: break;
        case 17: 
          { return JetTokens.PLUS      ;
          }
        case 105: break;
        case 67: 
          { return JetTokens.RAW_STRING_LITERAL;
          }
        case 106: break;
        case 55: 
          { return JetTokens.PLUSEQ    ;
          }
        case 107: break;
        case 27: 
          { return JetTokens.COMMA     ;
          }
        case 108: break;
        case 19: 
          { return JetTokens.GT        ;
          }
        case 109: break;
        case 4: 
          { return JetTokens.WHITE_SPACE;
          }
        case 110: break;
        case 24: 
          { return JetTokens.RPAR      ;
          }
        case 111: break;
        case 54: 
          { return JetTokens.DOUBLE_ARROW;
          }
        case 112: break;
        case 80: 
          { return JetTokens.TRUE_KEYWORD ;
          }
        case 113: break;
        case 36: 
          { return JetTokens.FIELD_IDENTIFIER;
          }
        case 114: break;
        case 59: 
          { return JetTokens.ANDAND    ;
          }
        case 115: break;
        case 63: 
          { pushState(LONG_TEMPLATE_ENTRY); return JetTokens.LONG_TEMPLATE_ENTRY_START;
          }
        case 116: break;
        case 66: 
          { return JetTokens.DOC_COMMENT;
          }
        case 117: break;
        case 35: 
          { return JetTokens.FLOAT_LITERAL;
          }
        case 118: break;
        case 39: 
          { return JetTokens.EOL_COMMENT;
          }
        case 119: break;
        case 83: 
          { return JetTokens.WHEN_KEYWORD ;
          }
        case 120: break;
        case 25: 
          { return JetTokens.COLON     ;
          }
        case 121: break;
        case 57: 
          { return JetTokens.LTEQ      ;
          }
        case 122: break;
        case 46: 
          { return JetTokens.ARROW     ;
          }
        case 123: break;
        case 32: 
          { popState(); return JetTokens.IDENTIFIER;
          }
        case 124: break;
        case 21: 
          { return JetTokens.LBRACKET  ;
          }
        case 125: break;
        case 65: 
          { yypushback(2); return JetTokens.INTEGER_LITERAL;
          }
        case 126: break;
        case 10: 
          { return JetTokens.CHARACTER_LITERAL;
          }
        case 127: break;
        case 72: 
          { return JetTokens.VAR_KEYWORD ;
          }
        case 128: break;
        case 58: 
          { return JetTokens.GTEQ      ;
          }
        case 129: break;
        case 2: 
          { return JetTokens.INTEGER_LITERAL;
          }
        case 130: break;
        case 13: 
          { return JetTokens.RBRACE    ;
          }
        case 131: break;
        case 87: 
          { return JetTokens.CLASS_KEYWORD ;
          }
        case 132: break;
        case 14: 
          { return JetTokens.EXCL      ;
          }
        case 133: break;
        case 69: 
          { return JetTokens.TRY_KEYWORD ;
          }
        case 134: break;
        case 52: 
          { return JetTokens.EXCLEQ    ;
          }
        case 135: break;
        case 45: 
          { return JetTokens.MINUSEQ   ;
          }
        case 136: break;
        case 89: 
          { return JetTokens.THROW_KEYWORD ;
          }
        case 137: break;
        case 86: 
          { return JetTokens.SUPER_KEYWORD ;
          }
        case 138: break;
        case 91: 
          { return JetTokens.WHILE_KEYWORD ;
          }
        case 139: break;
        case 44: 
          { return JetTokens.MINUSMINUS;
          }
        case 140: break;
        case 95: 
          { return JetTokens.CONTINUE_KEYWORD ;
          }
        case 141: break;
        case 74: 
          { return JetTokens.NOT_IN;
          }
        case 142: break;
        case 38: 
          { return JetTokens.ATAT      ;
          }
        case 143: break;
        case 6: 
          { return JetTokens.DIV       ;
          }
        case 144: break;
        case 37: 
          { return JetTokens.LABEL_IDENTIFIER;
          }
        case 145: break;
        case 29: 
          { return JetTokens.REGULAR_STRING_PART;
          }
        case 146: break;
        case 16: 
          { return JetTokens.QUEST     ;
          }
        case 147: break;
        case 60: 
          { return JetTokens.OROR      ;
          }
        case 148: break;
        case 20: 
          { return JetTokens.PERC      ;
          }
        case 149: break;
        case 76: 
          { return JetTokens.EXCLEQEQEQ;
          }
        case 150: break;
        case 61: 
          { return JetTokens.PERCEQ    ;
          }
        case 151: break;
        case 43: 
          { return JetTokens.RANGE     ;
          }
        case 152: break;
        case 1: 
          { return TokenType.BAD_CHARACTER;
          }
        case 153: break;
        case 96: 
          { return JetTokens.NAMESPACE_KEYWORD ;
          }
        case 154: break;
        case 75: 
          { return JetTokens.NOT_IS;
          }
        case 155: break;
        case 7: 
          { return JetTokens.MUL       ;
          }
        case 156: break;
        case 22: 
          { return JetTokens.RBRACKET  ;
          }
        case 157: break;
        case 56: 
          { return JetTokens.PLUSPLUS  ;
          }
        case 158: break;
        case 81: 
          { return JetTokens.THIS_KEYWORD ;
          }
        case 159: break;
        case 8: 
          { return JetTokens.DOT       ;
          }
        case 160: break;
        case 26: 
          { return JetTokens.SEMICOLON ;
          }
        case 161: break;
        case 50: 
          { return JetTokens.IF_KEYWORD ;
          }
        case 162: break;
        case 64: 
          { return JetTokens.ESCAPE_SEQUENCE;
          }
        case 163: break;
        case 31: 
          { popState(); return JetTokens.CLOSING_QUOTE;
          }
        case 164: break;
        case 15: 
          { return JetTokens.EQ        ;
          }
        case 165: break;
        case 5: 
          { return JetTokens.AT        ;
          }
        case 166: break;
        case 68: 
          { return JetTokens.AS_SAFE;
          }
        case 167: break;
        case 23: 
          { return JetTokens.LPAR      ;
          }
        case 168: break;
        case 9: 
          { return JetTokens.MINUS     ;
          }
        case 169: break;
        case 92: 
          { return JetTokens.FALSE_KEYWORD ;
          }
        case 170: break;
        case 82: 
          { return JetTokens.TYPE_KEYWORD ;
          }
        case 171: break;
        case 71: 
          { return JetTokens.FUN_KEYWORD ;
          }
        case 172: break;
        case 49: 
          { return JetTokens.IS_KEYWORD ;
          }
        case 173: break;
        case 30: 
          { popState(); yypushback(1); return JetTokens.DANGLING_NEWLINE;
          }
        case 174: break;
        case 33: 
          { lBraceCount++; return JetTokens.LBRACE;
          }
        case 175: break;
        case 85: 
          { yypushback(3); return JetTokens.EXCL;
          }
        case 176: break;
        case 41: 
          { return JetTokens.DIVEQ     ;
          }
        case 177: break;
        case 79: 
          { return JetTokens.ELSE_KEYWORD ;
          }
        case 178: break;
        case 47: 
          { return JetTokens.AS_KEYWORD ;
          }
        case 179: break;
        case 48: 
          { return JetTokens.IN_KEYWORD ;
          }
        case 180: break;
        case 53: 
          { return JetTokens.EQEQ      ;
          }
        case 181: break;
        case 77: 
          { return JetTokens.EQEQEQ    ;
          }
        case 182: break;
        case 73: 
          { return JetTokens.VAL_KEYWORD ;
          }
        case 183: break;
        case 84: 
          { return JetTokens.CAPITALIZED_THIS_KEYWORD ;
          }
        case 184: break;
        case 42: 
          { return JetTokens.MULTEQ    ;
          }
        case 185: break;
        case 62: 
          { pushState(SHORT_TEMPLATE_ENTRY);
                                            yypushback(yylength() - 1);
                                            return JetTokens.SHORT_TEMPLATE_ENTRY_START;
          }
        case 186: break;
        case 12: 
          { return JetTokens.LBRACE    ;
          }
        case 187: break;
        case 93: 
          { return JetTokens.OBJECT_KEYWORD ;
          }
        case 188: break;
        case 90: 
          { return JetTokens.BREAK_KEYWORD ;
          }
        case 189: break;
        case 40: 
          { return JetTokens.BLOCK_COMMENT;
          }
        case 190: break;
        case 88: 
          { return JetTokens.TRAIT_KEYWORD ;
          }
        case 191: break;
        case 28: 
          { return JetTokens.HASH      ;
          }
        case 192: break;
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
