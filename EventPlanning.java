package Cater;

import java.util.ArrayList;
import java.util.List;

public class EventPlanning {

	List<Invitee> invitees = new ArrayList<Invitee>();

	public void addInvitee(Invitee person) {
		invitees.add(person);
	}

	public int getAverageAge() {
		int averageAge = 0;
		for (int i = 0; i < invitees.size(); i++) {
			averageAge += invitees.get(i).getAge();
		}
		if (!invitees.isEmpty())
			return (averageAge) / (invitees.size());
		else
			return 0;
	}

	public int getTotalMoneyCollected() {
		int totalMoney = 0;
		for (Invitee i : invitees) {
			totalMoney += i.getAmountPaid();
		}
		return totalMoney;
	}

	public int getTotalNumberOfExpectedPeople() {
		int totalPeople = invitees.size();
		for (int i = 0; i < invitees.size(); i++) {
			totalPeople += invitees.get(i).getAdditionalPeople();
		}
		return totalPeople;
	}

	public void removeMinors() {

		for (int i = 0; i < invitees.size(); i++) {
			if (invitees.get(i).getAge() < 18) {
				invitees.remove(i);
				i -= 1;
			}
		}

	}

}
