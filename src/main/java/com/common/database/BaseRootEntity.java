package com.common.database;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;

@MappedSuperclass
@Getter
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseRootEntity {

	@Id
	@GenericGenerator(name = "tsid", type = CustomTsidGenerator.class)
	@GeneratedValue(generator = "tsid")
	protected Long id;

}
