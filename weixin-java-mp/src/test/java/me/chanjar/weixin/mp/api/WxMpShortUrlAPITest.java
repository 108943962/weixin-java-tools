package me.chanjar.weixin.mp.api;

import com.google.inject.Inject;
import me.chanjar.weixin.common.exception.WxErrorException;
import org.testng.Assert;
import org.testng.annotations.Guice;
import org.testng.annotations.Test;

/**
 * 测试短连接
 *
 * @author chanjarster
 */
@Test(groups = "shortURLAPI")
@Guice(modules = ApiTestModule.class)
public class WxMpShortUrlAPITest {

  @Inject
  protected WxMpService wxService;

  public void testShortUrl() throws WxErrorException {
    String shortUrl = this.wxService.shortUrl("www.baidu.com");
    Assert.assertNotNull(shortUrl);
  }

}
