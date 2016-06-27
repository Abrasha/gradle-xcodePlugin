package org.openbakery.stubs

import org.apache.commons.io.FileUtils
import org.openbakery.simulators.SimulatorControl

/**
 * Created by rene on 05.11.15.
 */
class SimulatorControlStub extends SimulatorControl {

	File simctlListOutput

	public SimulatorControlStub(String filename) {
		super(null, null, null)
		simctlListOutput = new File("src/test/Resource/", filename);
	}

	@Override
	String simctl(String... commands) {
		if (commands == ["list"]) {
			return FileUtils.readFileToString(simctlListOutput)
		}
		return null;
	}
}
