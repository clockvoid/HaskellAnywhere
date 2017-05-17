package core;

import result.CommunicationResult;

public class HaskellAnywhere {
	
	private String program;
	private String mainFunction;
	private final String defaultMainFunction = "main = print $ ";
	private RexTester compiler;
	
	public HaskellAnywhere() {
		this.program = "";
		this.mainFunction = "";
		this.compiler = new RexTester();
	}
	
	public CommunicationResult input(String arg0) {
		CommunicationResult result;
		StringAnalyzer analyzer = new StringAnalyzer(arg0);
		if (analyzer.isMain()) {
			mainFunction = this.defaultMainFunction;
			mainFunction += analyzer.getText();
			result = submit();
		} else {
			program += analyzer.getText() + "\n";
			result = ResultFactory.createAddDefineResult("{\"AddedDefine\":\"" + analyzer.getText() + "\"}");
		}
		return result;
	}
	
	public CommunicationResult submit() {
		return this.compiler.post(program + mainFunction, "");
	}
	
	public String getProgram() {
		return this.program;
	}
	
	public String getMainFunction() {
		return this.mainFunction;
	}
}
