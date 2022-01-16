package com.smarthardware.shop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    private ProductRepository productRepository;

    @Autowired
    public DataLoader(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void run(ApplicationArguments args) {
    	productRepository.save(new Product("USF-1516-SBR-04", "This durable round closet rod features a popular anodized, satin brass finish over aluminum.", "https://www.thehardwarehut.com/images/moreimages/closetorganizersandaccessories/usfutaba/usf-1516-sbr-8-big.jpg", 353.80));
    	productRepository.save(new Product("USF-1516-SBR-CFS", "This metal closet rod end support features a popular satin brass finish.", "https://www.thehardwarehut.com/images/moreimages/closetorganizersandaccessories/usfutaba/usf-1516-sbr-cfs-big.jpg", 107.90));
    	productRepository.save(new Product("USF-1516-SBR-OFS","This metal closet rod end support features a popular satin brass finish.","https://www.thehardwarehut.com/images/moreimages/closetorganizersandaccessories/usfutaba/usf-1516-sbr-ofs-big.jpg",116.60));
    	productRepository.save(new Product("USF-1516-SN-OFD","This doweled metal oval closet rod end support features a a popular satin nickel finish.","https://www.thehardwarehut.com/images/moreimages/closetorganizersandaccessories/usfutaba/usf-83351-sn-big.jpg",70.41));
    	productRepository.save(new Product("USF-1516-BLK-CFS","This metal closet rod end support features a popular matte black finish.","https://www.thehardwarehut.com/images/moreimages/closetorganizersandaccessories/usfutaba/1516-blk-cfs-big.jpg",77.90));
    	productRepository.save(new Product("USF-1516-SBR-CFD","This doweled metal oval closet rod end support features a a popular satin brass finish.","https://www.thehardwarehut.com/images/moreimages/closetorganizersandaccessories/usfutaba/usf-1516-sbr-cfd-big.jpg",91.7));
    	productRepository.save(new Product("USF-1516-SBR-HF","Screw-on metal closet rod center support features a satin brass finish.","https://www.thehardwarehut.com/images/moreimages/closetorganizersandaccessories/usfutaba/usf-1516-sbr-hf-big.jpg",70.80));
    	productRepository.save(new Product("USF-1516-SN-CFD","This doweled metal oval closet rod end support features a a popular satin nickel finish.","https://www.thehardwarehut.com/images/moreimages/closetorganizersandaccessories/usfutaba/usf-83311-sn-big.jpg",91.70));
    	productRepository.save(new Product("USF-1516-BLK-HF","This screw-on metal closet rod center support is for use with round 1-5/16\" diameter closet rod and features a popular matte black finish.","https://www.thehardwarehut.com/images/closet_organizers/usf-83319-orb.jpg",55.10));
    	productRepository.save(new Product("USF-1516-SBR-OFD","This doweled metal oval closet rod end support features a a popular satin brass finish.","https://www.thehardwarehut.com/images/moreimages/closetorganizersandaccessories/usfutaba/usf-1516-sbr-ofd-big.jpg",74.10));
    }
}
