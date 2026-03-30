package ma.ens.service;

import io.micrometer.core.instrument.Metrics;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class DemoService {

    private static final Logger logger = LoggerFactory.getLogger(DemoService.class);

    public String processData() {

        Metrics.counter("custom.requests.count").increment();

        logger.info("Démarrage du traitement");

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            logger.error("Erreur", e);
        }

        logger.info("Traitement terminé");

        return "Traitement effectué";
    }
}