package com.ctrip.xpipe.redis.console.controller.pub;

import com.ctrip.xpipe.api.codec.Codec;

/**
 * @author wenchao.meng
 *
 * Mar 21, 2017
 */
public class AbstractMeta {

	@Override
	public String toString() {
		return Codec.DEFAULT.encode(this);
	}
}
