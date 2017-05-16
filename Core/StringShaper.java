package Core;

public class StringShaper {
	
	private String program;
	private String mainFunction;
	private final String defaultMainFunction = "main = print $ ";
	private RegexTester compiler;
	
	public StringShaper() {
		this.program = "";
		this.mainFunction = "";
		this.compiler = new RegexTester();
	}
	
	public String input(String arg0) {
		String result = "";
		StringAnalyzer analyzer = new StringAnalyzer(arg0);
		if (analyzer.isMain()) {
			mainFunction = this.defaultMainFunction;
			mainFunction += analyzer.getText();
			result = new JsonAnalyzer(submit()).analyze().get("Result");
		} else {
			program += analyzer.getText() + "\n";
			result = "added define: " + analyzer.getText();
		}
		return result;
	}
	
	public String submit() {
		return this.compiler.post(program + mainFunction, "");
	}
	
	public String getProgram() {
		return this.program;
	}
	
	public String getMainFunction() {
		return this.mainFunction;
	}
}
