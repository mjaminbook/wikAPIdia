package org.wikapidia.cookbook.core;

import org.apache.commons.cli.*;
import org.wikapidia.conf.ConfigurationException;
import org.wikapidia.conf.Configurator;
import org.wikapidia.conf.DefaultOptionBuilder;
import org.wikapidia.core.cmd.Env;
import org.wikapidia.core.cmd.EnvBuilder;
import org.wikapidia.core.dao.DaoException;
import org.wikapidia.core.dao.DaoFilter;
import org.wikapidia.core.dao.LocalLinkDao;
import org.wikapidia.core.dao.LocalPageDao;
import org.wikapidia.core.lang.Language;
import org.wikapidia.core.model.LocalLink;
import org.wikapidia.core.model.LocalPage;
import org.wikapidia.core.model.NameSpace;
import org.wikapidia.core.model.Title;

import java.io.IOException;
import java.sql.SQLException;

/**
 * @author Shilad Sen
 */
public class ShowAnchorText {

    public static void main(String args[]) throws ConfigurationException, DaoException {
        Options options = new Options();
        EnvBuilder.addStandardOptions(options);

        CommandLineParser parser = new PosixParser();
        CommandLine cmd;
        try {
            cmd = parser.parse(options, args);
        } catch (ParseException e) {
            System.err.println("Invalid option usage: " + e.getMessage());
            new HelpFormatter().printHelp("DumpLoader", options);
            return;
        }

        Env env = new EnvBuilder(cmd).build();
        Configurator configurator = env.getConfigurator();
        LocalPageDao lpDao = configurator.get(LocalPageDao.class);
        LocalLinkDao sqlDao = configurator.get(LocalLinkDao.class, "sql");
        Language simple = env.getLanguages().getDefaultLanguage();

        LocalPage page = lpDao.getByTitle(new Title("List of Soundgarden band members", simple), NameSpace.ARTICLE);
        System.out.println("page is " + page);
        DaoFilter filter = new DaoFilter().setSourceIds(page.getLocalId()).setLanguages(simple);
        for (LocalLink link : sqlDao.get(filter)) {
            System.out.println("link is: " + link);
        }
    }
}
