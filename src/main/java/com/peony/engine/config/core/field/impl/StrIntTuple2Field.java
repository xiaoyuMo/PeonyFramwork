package com.peony.engine.config.core.field.impl;

import com.peony.engine.config.core.field.Tuple2Field;
import com.peony.engine.config.core.SplitUtil;
import com.peony.engine.config.core.Tuple2;

/**
 * Created by jiangmin.wu on 2018/3/7.
 */
public class StrIntTuple2Field extends Tuple2Field<Tuple2<String, Integer>> {

    public StrIntTuple2Field() {
        super("tuple2<string,int>", "Tuple2<String,Integer>", "null");
    }

    @Override
    public Tuple2<String, Integer> parseValue(String rawVal) {
        if (rawVal == null) {
            return null;
        }
        return SplitUtil.convertContentToTuple2(rawVal, String.class, Integer.class);
    }
}
