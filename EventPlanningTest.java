package Cater;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class EventPlanningTest {
	private EventPlanning eventPlanning;

	@Before
	public void setup() {
		eventPlanning = new EventPlanning();
		Invitee invitee1 = new Invitee("Arya", 12, 1, 30);
		Invitee invitee2 = new Invitee("Cersei", 36, 3, 90);
		Invitee invitee3 = new Invitee("John", 24, 6, 150);
		eventPlanning.addInvitee(invitee1);
		eventPlanning.addInvitee(invitee2);
		eventPlanning.addInvitee(invitee3);
	}

	@Test
	public void testGetAverageAge() {
		assertEquals(24, eventPlanning.getAverageAge());
		eventPlanning = new EventPlanning();
		assertEquals(0, eventPlanning.getAverageAge());

	}

	@Test
	public void testGetTotalMoneyCollected() {
		assertEquals(270, eventPlanning.getTotalMoneyCollected());
	}

	@Test
	public void testGetTotalNumberOfExpectedPeople() {
		// System.out.println(eventPlanning.getTotalNumberOfExpectedPeople());
		assertEquals(13, eventPlanning.getTotalNumberOfExpectedPeople());
	}

	@Test
	public void testRemoveMinors() {
		eventPlanning.addInvitee(new Invitee("Severa", 15, 1, 30));
		eventPlanning.addInvitee(new Invitee("Kendra", 15, 1, 30));
		eventPlanning.addInvitee(new Invitee("Pierre", 27, 1, 30));
		eventPlanning.removeMinors();
		assertEquals(13, eventPlanning.getTotalNumberOfExpectedPeople());
	}

}
