package com.rskytech.hmi.icd.common.model;

import java.util.List;

/**
 * 
 * @author robin
 *
 */
public interface IRSICDConfigContainerModel extends IRSICDConfigModel{

	public List<? extends IRSICDConfigModel> getRSICDConfigModels();
}
