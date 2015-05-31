package com.myseriousorganization.bigpipe.example;

import com.myseriousorganization.bigpipe.core.annotations.PageletTask;
import com.myseriousorganization.bigpipe.core.annotations.PageletTaskMethod;
import com.myseriousorganization.bigpipe.core.marker.ViewObject;
import com.myseriousorganization.bigpipe.example.vo.RightModuleVO;

@PageletTask(name="rightModule")
public class RightModuleDisplayTask {
	
	@PageletTaskMethod
	public ViewObject doingStuff() {
		try {
			Thread.sleep(5000);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return new RightModuleVO("Right Module name");
	}
}
