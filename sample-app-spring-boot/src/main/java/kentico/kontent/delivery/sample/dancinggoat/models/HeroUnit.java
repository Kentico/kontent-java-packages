package kentico.kontent.delivery.sample.dancinggoat.models;

import java.lang.String;
import java.util.List;
import kentico.kontent.delivery.Asset;
import kentico.kontent.delivery.ContentItemMapping;
import kentico.kontent.delivery.ElementMapping;
import kentico.kontent.delivery.System;
import kentico.kontent.delivery.Taxonomy;

/**
 * This code was generated by a <a href="https://github.com/Kentico/cloud-generators-java">cloud-generators-java tool</a>
 *
 * Changes to this file may cause incorrect behavior and will be lost if the code is regenerated.
 * For further modifications of the class, create a separate file and extend this class.
 */
@ContentItemMapping("hero_unit")
public class HeroUnit {
  @ElementMapping("sitemap")
  List<Taxonomy> sitemap;

  @ElementMapping("title")
  String title;

  @ElementMapping("image")
  List<Asset> image;

  @ElementMapping("marketing_message")
  String marketingMessage;

  System system;

  public List<Taxonomy> getSitemap() {
    return sitemap;
  }

  public void setSitemap(List<Taxonomy> sitemap) {
    this.sitemap = sitemap;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public List<Asset> getImage() {
    return image;
  }

  public void setImage(List<Asset> image) {
    this.image = image;
  }

  public String getMarketingMessage() {
    return marketingMessage;
  }

  public void setMarketingMessage(String marketingMessage) {
    this.marketingMessage = marketingMessage;
  }

  public System getSystem() {
    return system;
  }

  public void setSystem(System system) {
    this.system = system;
  }
}
