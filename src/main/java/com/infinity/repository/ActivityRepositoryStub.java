package com.infinity.repository;

import java.util.ArrayList;
import java.util.List;

import com.infinity.model.Activity;
import com.infinity.model.User;

public class ActivityRepositoryStub implements ActivityRepository {
	/* (non-Javadoc)
	 * @see com.pluralsight.repository.ActivityRepository#findAllActivities()
	 */
	@Override
	public void create(Activity activity) {
		// should issue a insert statement to the db 
	}
	public List<Activity> findAllActivities() {
		List<Activity> activities = new ArrayList<Activity>();
		
		Activity activity1 = new Activity();
		activity1.setDescription("Swimming");
		activity1.setDuration(55);
		
		activities.add(activity1);
		
		Activity activity2 = new Activity();
		activity2 = new Activity();
		
		activity2.setDescription("Cycling");
		activity2.setDuration(120);
		
		activities.add(activity2);
		
		return activities;
	}

	@Override
	public Activity findActivity(String activityId) {
		Activity activity1 = new Activity();
		activity1.setId("1234");
		activity1.setDescription("Swimming");
		activity1.setDuration(55);
		
		User user=  new User();
		user.setId("5678");
		user.setName("Bryan");
		activity1.setUser(user);
		return activity1;
	}
}
