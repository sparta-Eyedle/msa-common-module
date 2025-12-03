package com.common.database;

import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

import com.common.utils.TsidUtil;

public class CustomTsidGenerator implements IdentifierGenerator {
	@Override
	public Object generate(SharedSessionContractImplementor sharedSessionContractImplementor, Object o) {
		return TsidUtil.nextId();
	}
}
