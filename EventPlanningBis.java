package Cater;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class EventPlanningBis {
	List<Invitee> invitees = new ArrayList<Invitee>();

	public void addInvitee(Invitee person) {
		invitees.add(person);
	}

	public int getAverageAge() {
		AtomicInteger sum = new AtomicInteger(0);
		invitees.forEach(i -> sum.set(sum.get() + i.getAge()));
		return sum / invitees.size();
	}

	public int getTotalMoneyCollected() {
		return 0;
	}

	public int getTotalNumberOfExpectedPeople() {
		return 0;
	}

	public void removeMinors() {

	}

	public Map<String, Integer> groupByNames() {
		return null;
	}
}
