package com.lucciola.haskell;

import com.lucciola.result.CommunicationResult;

public class Haskell {

	private RexTester compiler;
	private String program;
	private String input;
	
	public Haskell() {
		this.compiler = new RexTester();
		this.program = "";
		this.input = "";
	}
	
	public CommunicationResult run() {
		return this.compiler.post(this.program, this.input);
	}
	
	public void setProgram(String arg0) {
		if (arg0 != null) {
			this.program = arg0;
		} else {
			this.program = "";
		}
	}
	
	public void setInput(String arg0) {
		if (arg0 != null) {
			this.input = arg0;
		} else {
			this.input = "";
		}
	}
	
	public String getProgram() {
		return this.program;
	}
	
	public String getInput() {
		return this.input;
	}
	
}
