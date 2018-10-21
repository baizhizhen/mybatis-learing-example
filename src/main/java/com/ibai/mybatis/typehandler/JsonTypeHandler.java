package com.ibai.mybatis.typehandler;

import com.google.gson.Gson;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author baizhizhen
 */
@MappedJdbcTypes(JdbcType.VARCHAR)
public class JsonTypeHandler<T extends JsonType> extends BaseTypeHandler<T> {
    private Gson gson = new Gson();

    private Class<T> type;

    public JsonTypeHandler(Class<T> type) {
        super();
        if (type == null) {
            throw new IllegalArgumentException("Type argument cannot be null");
        }
        this.type = type;
    }

    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, T parameter, JdbcType jdbcType) throws SQLException {
        ps.setString(i, gson.toJson(parameter));
    }

    @Override
    public T getNullableResult(ResultSet rs, String columnName) throws SQLException {
        return gson.fromJson(rs.getString(columnName), getJavaType());
    }

    @Override
    public T getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        return gson.fromJson(rs.getString(columnIndex), getJavaType());
    }

    @Override
    public T getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        return gson.fromJson(cs.getString(columnIndex), getJavaType());
    }


    private Class<T> getJavaType() {
        return this.type;
    }
}
