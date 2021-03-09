package org.nlpcn.es4sql.jdbc;

import com.alibaba.druid.util.jdbc.ResultSetMetaDataBase.ColumnMetaData;

import java.util.List;

/**
 * Created by allwefantasy on 8/30/16.
 */
public class ObjectResult {
    private final List<ColumnMetaData> headers;
    private final List<List<Object>> lines;

    public ObjectResult(List<ColumnMetaData> headers, List<List<Object>> lines) {
        this.headers = headers;
        this.lines = lines;
    }

    public List<ColumnMetaData> getHeaders() {
        return headers;
    }

    public List<List<Object>> getLines() {
        return lines;
    }
}
