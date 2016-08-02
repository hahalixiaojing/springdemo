package com.demo.infrastructure.repository;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedTypes;

@MappedTypes(java.time.LocalDateTime.class)
public class LocalDateTimeTypeHandler extends BaseTypeHandler<LocalDateTime> {

	@Override
	public void setNonNullParameter(PreparedStatement ps, int i,
			LocalDateTime parameter, JdbcType jdbcType) throws SQLException {
		ps.setString(i, parameter.toString());
	}

	@Override
	public LocalDateTime getNullableResult(ResultSet rs, String columnName)
			throws SQLException {
		Timestamp datetime = rs.getTimestamp(columnName);

		if (datetime == null) {
			return null;
		}
		return datetime.toLocalDateTime();
	}

	@Override
	public LocalDateTime getNullableResult(ResultSet rs, int columnIndex)
			throws SQLException {
		Timestamp datetime = rs.getTimestamp(columnIndex);
		if (datetime == null) {
			return null;
		}
		return datetime.toLocalDateTime();
	}

	@Override
	public LocalDateTime getNullableResult(CallableStatement cs, int columnIndex)
			throws SQLException {
		Timestamp datetime = cs.getTimestamp(columnIndex);
		if (datetime == null) {
			return null;
		}
		return datetime.toLocalDateTime();
	}

}
