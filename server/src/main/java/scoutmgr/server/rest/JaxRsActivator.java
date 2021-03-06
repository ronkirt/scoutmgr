package scoutmgr.server.rest;

import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import org.realityforge.replicant.server.ee.rest.ReplicantPollResource;
import org.realityforge.replicant.server.ee.rest.SessionRestService;

@ApplicationPath( "/api" )
public class JaxRsActivator
  extends Application
{
  @Override
  public Set<Class<?>> getClasses()
  {
    final Set<Class<?>> classes = new HashSet<>();
    classes.addAll( super.getClasses() );
    classes.add( SessionRestService.class );
    classes.add( ReplicantPollResource.class );
    classes.add( ScoutmgrBadSessionExceptionMapper.class );
    return classes;
  }
}
