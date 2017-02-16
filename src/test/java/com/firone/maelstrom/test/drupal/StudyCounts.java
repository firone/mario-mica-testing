package com.firone.maelstrom.test.drupal;

import com.firone.maelstrom.test.utils.UITester;
import org.junit.Test;
import org.openqa.selenium.By;

public class StudyCounts extends UITester {

  @Test
  public void check_that_network_count_in_list_is_valid() throws Exception {

    browser().navigate().to("http://localhost/drupal/mica/studies?page=1");

    browser().element(By.xpath("//*[@id='refresh-list']/div[2]//a[@class='btn-default btn-xxs'][1]")).hasText("3 Networks");
    browser().element(By.xpath("//*[@id='refresh-list']/div[2]//a[@class='btn-default btn-xxs'][1]")).click();
    browser().element(By.xpath("//div[@item='child']//span[@title='NuAge']")).hasText("NuAge");

    browser().element(By.xpath("//li[@role='presentation']//*[contains(text(),'Variables')]//small")).hasText("14,480");
    browser().element(By.xpath("//li[@role='presentation']//*[contains(text(),'Datasets')]//small")).hasText("29");
    browser().element(By.xpath("//li[@role='presentation']//*[contains(text(),'Studies')]//small")).hasText("9");
    browser().element(By.xpath("//li[@role='presentation']//*[contains(text(),'Networks')]//small")).hasText("3");

    browser().element(By.xpath("(//*[@class='tab-content']//td)[1]")).hasText("IALSA");
  }

  @Test
  public void check_that_datasets_count_in_list_is_valid() throws Exception {

    browser().navigate().to("http://localhost/drupal/mica/studies?page=1");

    browser().element(By.xpath("//*[@id='refresh-list']/div[2]//a[@class='btn-default btn-xxs'][2]")).hasText("4 Datasets");
    browser().element(By.xpath("//*[@id='refresh-list']/div[2]//a[@class='btn-default btn-xxs'][2]")).click();
    browser().element(By.xpath("//div[@item='child']//span[@title='NuAge']")).hasText("NuAge");

    browser().element(By.xpath("//li[@role='presentation']//*[contains(text(),'Variables')]//small")).hasText("4,081");
    browser().element(By.xpath("//li[@role='presentation']//*[contains(text(),'Datasets')]//small")).hasText("4");
    browser().element(By.xpath("//li[@role='presentation']//*[contains(text(),'Studies')]//small")).hasText("1");
    browser().element(By.xpath("//li[@role='presentation']//*[contains(text(),'Networks')]//small")).hasText("3");

    browser().element(By.xpath("(//localized[@value='summary.acronym']/span)[1]")).hasText("NuAge-T1");
  }

  @Test
  public void check_that_studyVariables_count_in_list_is_valid() throws Exception {

    browser().navigate().to("http://localhost/drupal/mica/studies?page=1");

    browser().element(By.xpath("//*[@id='refresh-list']/div[2]//a[@class='btn-default btn-xxs'][3]")).hasText("4,081 Study Variables");
    browser().element(By.xpath("//*[@id='refresh-list']/div[2]//a[@class='btn-default btn-xxs'][3]")).click();
    browser().element(By.xpath("//div[@item='child']//span[@title='NuAge']")).hasText("NuAge");
    browser().element(By.xpath("//div[@item='child']//span[@title='Study']")).hasText("Study");

    browser().element(By.xpath("//li[@role='presentation']//*[contains(text(),'Variables')]//small")).hasText("4,081");
    browser().element(By.xpath("//li[@role='presentation']//*[contains(text(),'Datasets')]//small")).hasText("4");
    browser().element(By.xpath("//li[@role='presentation']//*[contains(text(),'Studies')]//small")).hasText("1");
    browser().element(By.xpath("//li[@role='presentation']//*[contains(text(),'Networks')]//small")).hasText("3");

    browser().element(By.xpath("(//*[@display='search.display']//td)[1]")).hasText("A1BT1");
  }
}
