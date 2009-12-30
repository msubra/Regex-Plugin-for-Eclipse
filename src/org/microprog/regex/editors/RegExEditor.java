package org.microprog.regex.editors;

import org.apache.xml.utils.DOMBuilder;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.MultiPageEditorPart;

/**
				Common Public License - v 1.0

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
 * @author Maheshwaran.S, Indumathi.R
 *
 */

/**
 * This class is used to create a Regular Expression editor
 * This has 2 pages:
 * <ul>
 * <li>page 0 contains a Expression Editor
 * <li>page 1 Contains result viewer
 * </ul>
 */
public class RegExEditor
	extends MultiPageEditorPart
	implements RegExEvaluvateConstants {

	/* Text widgets used */
	private Text text, expr, result;
	/* Combo widgets used */
	private Combo patternList, matchTypeList;
	/* Button widget used */
	private Button caseSensitiveList, checkButton;

	/** Evaluvate object */
	private final Evaluvate eval;
	private Font f;
	
	/**
	 * Creates a Regular Expression multi-page editor.
	 */
	public RegExEditor() {
		super();
		eval = new Evaluvate();
		f = new Font(null, "Courier", 9, SWT.NORMAL);
	}

	/**
	 * Creates page of the Regular Expression editor,
	 */
	void createPageExprEditor() {
		try {
			Composite parent = getContainer();
			Composite composite = new Composite(parent, SWT.NONE);

			FormLayout layout = new FormLayout();
			composite.setLayout(layout);
			layout.marginHeight = 5;

			/*expression type -combo */
			FormData f1 = new FormData();
			f1.left = new FormAttachment(0, 0);
			Label l1 = new Label(composite, SWT.NONE);
			l1.setText("Expression type:");
			l1.setLayoutData(f1);

			FormData f2 = new FormData();
			f2.left = new FormAttachment(l1, 5);
			patternList = new Combo(composite, SWT.READ_ONLY);
			patternList.setItems(patternItems);
			patternList.select(0);
			patternList.setLayoutData(f2);

			/*match type -combo */
			FormData f3 = new FormData();
			f3.left = new FormAttachment(patternList, 5);
			Label l2 = new Label(composite, SWT.NONE);
			l2.setText("Match type:");
			l2.setLayoutData(f3);

			FormData f4 = new FormData();
			f4.left = new FormAttachment(l2);
			matchTypeList = new Combo(composite, SWT.READ_ONLY);
			matchTypeList.setItems(matchTypeItems);
			matchTypeList.select(0);
			matchTypeList.setLayoutData(f4);
			matchTypeList.addSelectionListener(new SelectionAdapter() {
				public void widgetSelected(SelectionEvent e) {
					eval.setMatchType(matchTypeList.getSelectionIndex());
				}
			});

			/* Case Sensitve or Case Insensitive Option */
			FormData f5 = new FormData();
			f5.top = new FormAttachment(matchTypeList, 3);
			caseSensitiveList = new Button(composite, SWT.CHECK);
			caseSensitiveList.setText("Case Sensitive");
			caseSensitiveList.setLayoutData(f5);
			caseSensitiveList.addSelectionListener(new SelectionAdapter() {
				public void widgetSelected(SelectionEvent e) {
					int x, y;
					x = eval.getPatternType();
					y =
						caseSensitiveList.getSelection() == true
							? CASE_SENSITIVE
							: CASE_INSENSITIVE;
					eval.setCaseType(Evaluvate.CASE_MASK[x][y]);
				}
			});

			/* Multiline Option */
			FormData f6 = new FormData();
			f6.left = new FormAttachment(caseSensitiveList, 3);
			f6.top = new FormAttachment(matchTypeList, 3);
			final Button multiLine = new Button(composite, SWT.CHECK);
			multiLine.setText("MultiLine");
			multiLine.setLayoutData(f6);
			multiLine.addSelectionListener(new SelectionAdapter() {
				public void widgetSelected(SelectionEvent e) {
					eval.setMultiLine(multiLine.getSelection());
				}
			});

			/* Debug Option */
			FormData f7 = new FormData();
			f7.left = new FormAttachment(multiLine, 3);
			f7.top = new FormAttachment(matchTypeList, 3);
			final Button debug = new Button(composite, SWT.CHECK);
			debug.setText("Debug");
			debug.setLayoutData(f7);
			debug.addSelectionListener(new SelectionAdapter() {
				public void widgetSelected(SelectionEvent e) {
					eval.setDebug(debug.getSelection());
				}
			});

			/* compile and run button */
			FormData f8 = new FormData();
			f8.left = new FormAttachment(debug, 3);
			f8.top = new FormAttachment(matchTypeList, 3);
			Button compile = new Button(composite, SWT.NONE);
			compile.setText("Compile && Run");
			compile.setLayoutData(f8);
			compile.addSelectionListener(new SelectionAdapter() {
				public void widgetSelected(SelectionEvent e) {
					setActivePage(1);
					eval.setPattern(expr.getText());
					eval.setData(text.getText());
					eval.eval();
				}
			});

			/* Pattern editor */
			FormData f9 = new FormData();
			f9.top = new FormAttachment(caseSensitiveList, 5);
			Label l3 = new Label(composite, SWT.NONE);
			l3.setText("Enter the regular Expression:");
			l3.setLayoutData(f9);

			FormData f10 = new FormData();
			f10.top = new FormAttachment(l3, 3);
			f10.height = 70;
			f10.width = 500;
			expr = new Text(composite, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);
			expr.setLayoutData(f10);
			expr.setFont(f);

			/* data editor */
			FormData f11 = new FormData();
			f11.top = new FormAttachment(expr, 3);
			Label l4 = new Label(composite, SWT.NONE);
			l4.setText("Enter the Data Expression:");
			l4.setLayoutData(f11);

			FormData f12 = new FormData();
			f12.top = new FormAttachment(l4, 3);
			f12.height = 200;
			f12.width = 500;
			text = new Text(composite, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);
			text.setLayoutData(f12);
			text.setFont(f);

			/* patternList combo box selection listener */
			patternList.addSelectionListener(new SelectionAdapter() {
				public void widgetSelected(SelectionEvent e) {
					eval.setPatternType(patternList.getSelectionIndex());

					/* if the seleted is PERL Type Expression the
					 * switch on the Debug option too
					 */

					if (patternList.getSelectionIndex()
						== Evaluvate.PERL5_EXPRESSION) {
						debug.setEnabled(true);
					}
					else
						debug.setEnabled(false);

					/* if the seleted is Glob Type Expression the
					 * switch on the multi line
					 */
					if (patternList.getSelectionIndex()
						== Evaluvate.GLOB_EXPRESSION) {
						multiLine.setEnabled(false);
					}
					else
						multiLine.setEnabled(true);
				}
			});

			int index = addPage(composite);
			setPageText(index, "Expression Editor");

		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * Creates page Expression Results of the multi-page editor,
	 * which shows the result of the Expression editor
	 */
	void createPageResult() {
		Composite composite = new Composite(getContainer(), SWT.NONE);
		FillLayout layout = new FillLayout();
		composite.setLayout(layout);
		result = new Text(composite, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);

		result.setEditable(false);

		result.setFont(f);

		int index = addPage(composite);
		setPageText(index, "Expression Results");
	}
	/**
	 * Creates the pages of the multi-page editor.
	 */
	protected void createPages() {
		createPageExprEditor();
		createPageResult();

		/* set the current result editor to the
		 * evaluvate object*/
		eval.setResultEditor(result);

		/* enable double clicking */
		text.setDoubleClickEnabled(true);
		expr.setDoubleClickEnabled(true);
	}

	/**
	 * Saves the multi-page editor's document.
	 */
	public void doSave(IProgressMonitor monitor) {
	}

	/* process the save function */
	public void doSaveAs() {
	}
	

	/* (non-Javadoc)
	 * Method declared on IEditorPart
	 */
	public void gotoMarker(IMarker marker) {
		setActivePage(0);
		getEditor(0).gotoMarker(marker);
	}
	/**
	 * The <code>Regular ExpressionExample</code> implementation of this method
	 * checks that the input is an instance of <code>IFileEditorInput</code>.
	 */
	public void init(IEditorSite site, IEditorInput editorInput)
		throws PartInitException {
		if (!(editorInput instanceof IFileEditorInput))
			throw new PartInitException("Invalid Input: Must be Regular Expression File");
		super.init(site, editorInput);
	}
	/* (non-Javadoc)
	 * Method declared on IEditorPart.
	 */
	public boolean isSaveAsAllowed() {
		return false;
	}
	/**
	 * Calculates the contents of page when the it is activated.
	 */
	protected void pageChange(int newPageIndex) {
		super.pageChange(newPageIndex);
	}
}