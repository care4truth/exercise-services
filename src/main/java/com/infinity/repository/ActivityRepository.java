package com.infinity.repository;

import java.util.List;

import com.infinity.model.Activity;

public interface ActivityRepository {

	List<Activity> findAllActivities();

	Activity findActivity(String activityId);

	void create(Activity activity);

}