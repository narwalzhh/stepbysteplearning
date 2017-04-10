package com.rookiego.quiz.day3;

public class TestClassComputer {
	private String mouse;
	private String keyboard;
	private String graphicsCard;
	private String screen;
	private String cpu;
	private String mainboard;
	private String powerSupply;

	public TestClassComputer(String mouse, String keyboard, String graphicsCard, String screen, String cpu,
			String mainboard, String powerSupply) {
		this.mouse = mouse;
		this.keyboard = keyboard;
		this.graphicsCard = graphicsCard;
		this.screen = screen;
		this.cpu = cpu;
		this.mainboard = mainboard;
		this.powerSupply = powerSupply;
	}

	public String toString() {
		String back = "mouse:" + mouse + ",keyboard:" + keyboard + ", graphicsCard:" + graphicsCard + ",screen:"
				+ screen + ",cpu:" + cpu + ",mainboard:" + mainboard + ",powerSupply:" + powerSupply;
		return back;
	}
}