package org.microprog.regex.editors;
import java.util.ArrayList;
import java.util.Arrays;

import org.eclipse.swt.custom.StyleRange;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Device;
import org.eclipse.swt.graphics.DeviceData;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.internal.Workbench;
import org.apache.oro.text.*;
import org.apache.oro.text.awk.*;
import org.apache.oro.text.regex.*;

/**
 * @author Maheshwaran.S, Indumathi.R
 */

/**
 * 			Common Public License - v 1.0 

THE ACCOMPANYING PROGRAM IS PROVIDED UNDER THE TERMS OF THIS COMMON PUBLIC LICENSE ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF THE PROGRAM CONSTITUTES RECIPIENT'S ACCEPTANCE OF THIS AGREEMENT. 


1. DEFINITIONS 

"Contribution" means: 

a) in the case of the initial Contributor, the initial code and documentation distributed under this Agreement, and
b) in the case of each subsequent Contributor:
i) changes to the Program, and
ii) additions to the Program;
where such changes and/or additions to the Program originate from and are distributed by that particular Contributor. A Contribution 'originates' from a Contributor if it was added to the Program by such Contributor itself or anyone acting on such Contributor's behalf. Contributions do not include additions to the Program which: (i) are separate modules of software distributed in conjunction with the Program under their own license agreement, and (ii) are not derivative works of the Program. 

"Contributor" means any person or entity that distributes the Program. 


"Licensed Patents " mean patent claims licensable by a Contributor which are necessarily infringed by the use or sale of its Contribution alone or when combined with the Program. 


"Program" means the Contributions distributed in accordance with this Agreement. 


"Recipient" means anyone who receives the Program under this Agreement, including all Contributors. 


2. GRANT OF RIGHTS 

a) Subject to the terms of this Agreement, each Contributor hereby grants Recipient a non-exclusive, worldwide, royalty-free copyright license to reproduce, prepare derivative works of, publicly display, publicly perform, distribute and sublicense the Contribution of such Contributor, if any, and such derivative works, in source code and object code form.
b) Subject to the terms of this Agreement, each Contributor hereby grants Recipient a non-exclusive, worldwide, royalty-free patent license under Licensed Patents to make, use, sell, offer to sell, import and otherwise transfer the Contribution of such Contributor, if any, in source code and object code form. This patent license shall apply to the combination of the Contribution and the Program if, at the time the Contribution is added by the Contributor, such addition of the Contribution causes such combination to be covered by the Licensed Patents. The patent license shall not apply to any other combinations which include the Contribution. No hardware per se is licensed hereunder. 
c) Recipient understands that although each Contributor grants the licenses to its Contributions set forth herein, no assurances are provided by any Contributor that the Program does not infringe the patent or other intellectual property rights of any other entity. Each Contributor disclaims any liability to Recipient for claims brought by any other entity based on infringement of intellectual property rights or otherwise. As a condition to exercising the rights and licenses granted hereunder, each Recipient hereby assumes sole responsibility to secure any other intellectual property rights needed, if any. For example, if a third party patent license is required to allow Recipient to distribute the Program, it is Recipient's responsibility to acquire that license before distributing the Program.
d) Each Contributor represents that to its knowledge it has sufficient copyright rights in its Contribution, if any, to grant the copyright license set forth in this Agreement. 
3. REQUIREMENTS 

A Contributor may choose to distribute the Program in object code form under its own license agreement, provided that: 

a) it complies with the terms and conditions of this Agreement; and
b) its license agreement:
i) effectively disclaims on behalf of all Contributors all warranties and conditions, express and implied, including warranties or conditions of title and non-infringement, and implied warranties or conditions of merchantability and fitness for a particular purpose; 
ii) effectively excludes on behalf of all Contributors all liability for damages, including direct, indirect, special, incidental and consequential damages, such as lost profits; 
iii) states that any provisions which differ from this Agreement are offered by that Contributor alone and not by any other party; and
iv) states that source code for the Program is available from such Contributor, and informs licensees how to obtain it in a reasonable manner on or through a medium customarily used for software exchange. 
When the Program is made available in source code form: 

a) it must be made available under this Agreement; and 
b) a copy of this Agreement must be included with each copy of the Program. 

Contributors may not remove or alter any copyright notices contained within the Program. 


Each Contributor must identify itself as the originator of its Contribution, if any, in a manner that reasonably allows subsequent Recipients to identify the originator of the Contribution. 


4. COMMERCIAL DISTRIBUTION 

Commercial distributors of software may accept certain responsibilities with respect to end users, business partners and the like. While this license is intended to facilitate the commercial use of the Program, the Contributor who includes the Program in a commercial product offering should do so in a manner which does not create potential liability for other Contributors. Therefore, if a Contributor includes the Program in a commercial product offering, such Contributor ("Commercial Contributor") hereby agrees to defend and indemnify every other Contributor ("Indemnified Contributor") against any losses, damages and costs (collectively "Losses") arising from claims, lawsuits and other legal actions brought by a third party against the Indemnified Contributor to the extent caused by the acts or omissions of such Commercial Contributor in connection with its distribution of the Program in a commercial product offering. The obligations in this section do not apply to any claims or Losses relating to any actual or alleged intellectual property infringement. In order to qualify, an Indemnified Contributor must: a) promptly notify the Commercial Contributor in writing of such claim, and b) allow the Commercial Contributor to control, and cooperate with the Commercial Contributor in, the defense and any related settlement negotiations. The Indemnified Contributor may participate in any such claim at its own expense. 


For example, a Contributor might include the Program in a commercial product offering, Product X. That Contributor is then a Commercial Contributor. If that Commercial Contributor then makes performance claims, or offers warranties related to Product X, those performance claims and warranties are such Commercial Contributor's responsibility alone. Under this section, the Commercial Contributor would have to defend claims against the other Contributors related to those performance claims and warranties, and if a court requires any other Contributor to pay any damages as a result, the Commercial Contributor must pay those damages. 


5. NO WARRANTY 

EXCEPT AS EXPRESSLY SET FORTH IN THIS AGREEMENT, THE PROGRAM IS PROVIDED ON AN "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, EITHER EXPRESS OR IMPLIED INCLUDING, WITHOUT LIMITATION, ANY WARRANTIES OR CONDITIONS OF TITLE, NON-INFRINGEMENT, MERCHANTABILITY OR FITNESS FOR A PARTICULAR PURPOSE. Each Recipient is solely responsible for determining the appropriateness of using and distributing the Program and assumes all risks associated with its exercise of rights under this Agreement, including but not limited to the risks and costs of program errors, compliance with applicable laws, damage to or loss of data, programs or equipment, and unavailability or interruption of operations. 


6. DISCLAIMER OF LIABILITY 

EXCEPT AS EXPRESSLY SET FORTH IN THIS AGREEMENT, NEITHER RECIPIENT NOR ANY CONTRIBUTORS SHALL HAVE ANY LIABILITY FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING WITHOUT LIMITATION LOST PROFITS), HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OR DISTRIBUTION OF THE PROGRAM OR THE EXERCISE OF ANY RIGHTS GRANTED HEREUNDER, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGES. 


7. GENERAL 

If any provision of this Agreement is invalid or unenforceable under applicable law, it shall not affect the validity or enforceability of the remainder of the terms of this Agreement, and without further action by the parties hereto, such provision shall be reformed to the minimum extent necessary to make such provision valid and enforceable. 


If Recipient institutes patent litigation against a Contributor with respect to a patent applicable to software (including a cross-claim or counterclaim in a lawsuit), then any patent licenses granted by that Contributor to such Recipient under this Agreement shall terminate as of the date such litigation is filed. In addition, if Recipient institutes patent litigation against any entity (including a cross-claim or counterclaim in a lawsuit) alleging that the Program itself (excluding combinations of the Program with other software or hardware) infringes such Recipient's patent(s), then such Recipient's rights granted under Section 2(b) shall terminate as of the date such litigation is filed. 


All Recipient's rights under this Agreement shall terminate if it fails to comply with any of the material terms or conditions of this Agreement and does not cure such failure in a reasonable period of time after becoming aware of such noncompliance. If all Recipient's rights under this Agreement terminate, Recipient agrees to cease use and distribution of the Program as soon as reasonably practicable. However, Recipient's obligations under this Agreement and any licenses granted by Recipient relating to the Program shall continue and survive. 


Everyone is permitted to copy and distribute copies of this Agreement, but in order to avoid inconsistency the Agreement is copyrighted and may only be modified in the following manner. The Agreement Steward reserves the right to publish new versions (including revisions) of this Agreement from time to time. No one other than the Agreement Steward has the right to modify this Agreement. IBM is the initial Agreement Steward. IBM may assign the responsibility to serve as the Agreement Steward to a suitable separate entity. Each new version of the Agreement will be given a distinguishing version number. The Program (including Contributions) may always be distributed subject to the version of the Agreement under which it was received. In addition, after a new version of the Agreement is published, Contributor may elect to distribute the Program (including its Contributions) under the new version. Except as expressly stated in Sections 2(a) and 2(b) above, Recipient receives no rights or licenses to the intellectual property of any Contributor under this Agreement, whether expressly, by implication, estoppel or otherwise. All rights in the Program not expressly granted under this Agreement are reserved. 


This Agreement is governed by the laws of the State of New York and the intellectual property laws of the United States of America. No party to this Agreement will bring a legal action under this Agreement more than one year after the cause of action arose. Each party waives its rights to a jury trial in any resulting litigation. 
*/

/**
 * This class is for evaluvating the expressions
 */

public class Evaluvate implements RegExEvaluvateConstants {

	/* Case mask for each type of compiler
	 * DEFAULT_MASK 			-> Case Sensitive match
	 * CASE_INSENSITIVE_MASK 	-> Case Insensitive match
	 * MULTILINE_MASK 			-> Multiple line processing
	 */
	static int[] CASE_MASK[] =
		{
			{
				Perl5Compiler.DEFAULT_MASK,
				Perl5Compiler.CASE_INSENSITIVE_MASK,
				Perl5Compiler.MULTILINE_MASK },
			{
			AwkCompiler.DEFAULT_MASK,
				AwkCompiler.CASE_INSENSITIVE_MASK,
				AwkCompiler.MULTILINE_MASK },
				{
			GlobCompiler.DEFAULT_MASK,
				GlobCompiler.CASE_INSENSITIVE_MASK,
				GlobCompiler.DEFAULT_MASK }
	};

	/* Generic Pattern compiler and matcher */
	PatternCompiler compiler[];
	PatternMatcher matcher[];
	
	/* Perl Debugger */
	Perl5Debug debugger;

	/*Result buffer */
	Text result;
	
	/* Flags */
	int patternType, caseType, matchType;
	boolean multiLine, debug;
	
	/* Expresion and Data */
	String expr, data;
	
	/* Pattern Matcher Objects */
	MatchResult matchResult;
	Pattern pattern;
	PatternMatcherInput input;
	
	/* Border Object, used to contruct 80 dashes( '-' )
	 */
	char[] border = new char[80];

	/**
	 * Constructor for Evaluvate.
	 */
	public Evaluvate() {
		
		/* Intialize compilers and matchers */
		int count = RegExEditor.patternItems.length;
		compiler = new PatternCompiler[count];
		matcher = new PatternMatcher[count];

		compiler[PERL5_EXPRESSION] = new Perl5Compiler();
		matcher[PERL5_EXPRESSION] = new Perl5Matcher();

		compiler[AWK_EXPRESSION] = new AwkCompiler();
		matcher[AWK_EXPRESSION] = new AwkMatcher();

		compiler[GLOB_EXPRESSION] = new GlobCompiler();
		matcher[GLOB_EXPRESSION] = matcher[PERL5_EXPRESSION];

		/* create border text */
		Arrays.fill(border, '-');
	}

	/**
	 * This method sets the result editor
	 * @param editor of type Text
	 * @return nothing
	 */
	public void setResultEditor(Text editor) {
		this.result = editor;
	}

	/**
	 * This method sets the type of Regular expression,
	 * i.e Perl, Awk or Glob Expression
	 * @param type
	 * @return nothing
	 */
	public void setPatternType(int type) {
		this.patternType = type;
	}

	/**
	 * This method sets the type of Matching
	 * i.e Exact matching or containing matching
	 * @param type
	 * @return nothing
	 */
	public void setMatchType(int type) {
		this.matchType = type;
	}

	/**
	 * This method returns the type of Matching
	 * @return matching type constant
	 */
	public int getMatchType() {
		return matchType;
	}

	/**
	 * This method sets the Case sensitive or insensitive flag
	 * @param type
	 * @return nothing
	 */
	public void setCaseType(int type) {
		this.caseType = type;
	}

	/**
	 * This method returns the type of Case,
	 * i.e case sensitive or insensitive
	 * @return CASE_SENSITIVE or CASE_INSENSITIVE
	 */
	public int getCaseType() {
		return this.caseType;
	}

	/**
	 * This method sets the Expression pattern
	 * @param Expression String 
	 * @return nothing
	 */
	public void setPattern(String expr) {
		this.expr = expr;
	}

	/**
	 * This method sets the Data in which the expression
	 * is to be applied
	 * @param Data String 
	 * @return nothing
	 */
	public void setData(String data) {
		this.data = data;
	}

	/**
	 * This method generates Header text
	 * @return nothing
	 */
	private void processHeader() {
		result.setText("");
		setMessage(
			"Expression Type:\t"
				+ RegExEditor.patternItems[patternType]
				+ "\n");
		setMessage(
			"Case Type:\t"
				+ (caseType == CASE_SENSITIVE
					? "Case Senitive"
					: "Case InSensitive")
				+ "\n");
		setMessage(
			"Matching Type:\t" + RegExEditor.matchTypeItems[matchType] + "\n");

		setMessage("Multi Line:\t" + (multiLine ? " YES " : " NO ") + "\n");
		setMessage("Debug:\t" + (debug ? " YES " : " NO ") + "\n");
	}

	/**
	 * This method compiles the regular expression pattern
	 * @return nothing
	 */
	private void compile() {
		try {
			int type = caseType;
			if (this.isMultiLine())
				type = type | CASE_MASK[patternType][2];
			pattern = compiler[patternType].compile(expr, type);
		}
		catch (MalformedPatternException e) {
			setMessage("Bad pattern:\t");
			setMessage("Malformed Regular Expression:\n" + e.getMessage());
			return;
		}
	}

	/**
	 * This method generates debug info for PERL pattern
	 * @return nothing
	 */
	private void processDebug() {
		setMessage(new String(border) + "\n");
		setMessage("Debugger Output\n");
		setMessage(Perl5Debug.printProgram((Perl5Pattern) pattern));
		setMessage(new String(border) + "\n");
	}

	/**
	 * This method evaluvates the regular expression
	 * @param nothing
	 * @return nothing
	 */

	public void eval() {
		setMessage(new String(border));
		processHeader();
		setMessage(new String(border));

		/* compile the expression */
		compile();

		/* matching process */
		int matchNum = 0, group;
		setMessage("\nSearching for Patterns...\n\n");

		
		if (matchType == PATTERN_MATCHES) { 
			/* matchType == Exact match */
			if (matcher[patternType].matches(data, pattern))
				setMessage("Data is EXACTLY MATCHED\n");
			else
				setMessage("Data is NOT EXACTLY MATCHED\n");
		}
		else if (matchType == PATTERN_CONTAINS) {
			/* matchType == Contains match */
			input = new PatternMatcherInput(data);
			while (matcher[patternType].contains(input, pattern)) {
				int groups;
				matchResult = matcher[patternType].getMatch();
				++matchNum;

				/* display the matching text part, it's length and location */
				setMessage(
					"Match " + matchNum + ": " + matchResult.group(0) + "\n");
				setMessage("Length: " + matchResult.length() + "\n");
				setMessage(
					"Begin offset: " + matchResult.beginOffset(0) + "\n");
				setMessage("End offset: " + matchResult.endOffset(0) + "\n\n");

				/* Get the groups any present and also 
				 * display the matching text part, it's 
				 * length and location
				 */			
				groups = matchResult.groups();
				if (groups > 1) {
					setMessage("    Subgroups:\n");
					for (group = 1; group < groups; group++) {
						setMessage(
							" "
								+ group
								+ ": "
								+ matchResult.group(group)
								+ "\n");
						setMessage(
							"    "
								+ group
								+ ": "
								+ matchResult.group(group)
								+ "\n");
						setMessage(
							"Length: "
								+ matchResult.group(group).length()
								+ "\n");

						setMessage("Begin: " + matchResult.begin(group) + "\n");
						setMessage("End: " + matchResult.end(group) + "\n\n");
					}
				}
			}
			setMessage("\nThe input contained " + matchNum + " matches.\n");

			setMessage(new String(border) + "\n");
		}
		if (this.isDebug())
			processDebug();
	}

	/**
	 * This method sets the message give to the <B>result editor<B>
	 * @param Message String
	 * @return nothing
	 */

	private void setMessage(String s) {
		if (result != null)
			result.append(s);
	}

	/**
	 * Returns the expr.
	 * @return String
	 */
	public String getPattern() {
		return expr;
	}

	/**
	 * Returns the patternType.
	 * @return int
	 */
	public int getPatternType() {
		return patternType;
	}

	/**
	 * Returns the result.
	 * @return Text
	 */
	public Text getResultEditor() {
		return result;
	}

	/**
	 * Returns the debug.
	 * @return boolean
	 */
	public boolean isDebug() {
		return debug;
	}

	/**
	 * Returns the multiLine.
	 * @return boolean
	 */
	public boolean isMultiLine() {
		return multiLine;
	}

	/**
	 * Sets the debug.
	 * @param debug The debug to set
	 */
	public void setDebug(boolean debug) {
		this.debug = debug;
	}

	/**
	 * Sets the multiLine.
	 * @param multiLine The multiLine to set
	 */
	public void setMultiLine(boolean multiLine) {
		this.multiLine = multiLine;
	}
}
