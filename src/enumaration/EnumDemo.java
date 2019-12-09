package enumaration;

public enum EnumDemo {

	Enquire_Balance("enquire_balance"), 
	Card_Change_Pin("change_pin"),
	CARD_BLOCKED("card_blocked_small"),
	Card_Pin_Blocked("card_pin_blocked"),
	Pre_Redeem("pre_redeem"), Redeem("redeem"),
	Instruction("instruction");

	String type;

	EnumDemo(String t) { // public
		type = t;
	}
}
