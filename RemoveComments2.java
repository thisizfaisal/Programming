import java.io.*;

public class RemoveComments2
{
       public void removeComments( String fileName )
      {
            int ch;
            boolean slashCommentFound = false;
            boolean starCommentFound = false;
            boolean firstSlashFound = false;
            boolean startOfComment = false;
            boolean endOfComment = false;
            boolean startDoubleQuoteFound = false;
           StringBuilder javaDoc = new StringBuilder();
  
           try
          {
                     BufferedReader reader =
                                        new BufferedReader( new FileReader( fileName ) );
   
                      while( ( ch = reader.read() ) != -1 )
                     {
                             javaDoc.append( (char)ch );
    
                             if( ch == '\"' )
                                      startDoubleQuoteFound = !startDoubleQuoteFound;
    
                             if( startDoubleQuoteFound
                                  && ( starCommentFound == true
                                  || slashCommentFound == true ) )
                                       continue;
    
                              if( ch == '/' )
                             {
                                    if( starCommentFound == true
                                                  && endOfComment == false )
                                              continue;
     
                                      if( endOfComment
                                                 && starCommentFound == true )
                                      {
                                             starCommentFound = false;
                                             endOfComment = false;
                                             startOfComment = false;
                                             continue;
                                       }

                                     else if( firstSlashFound
                                                   && slashCommentFound == false
                                                   && starCommentFound == false )
                                     {
                                               slashCommentFound = true;
                                               firstSlashFound = false;
                                               continue;
                                     }

                                     else if( slashCommentFound == false
                                                   && starCommentFound == false
                                                   && startDoubleQuoteFound == false )
                                   {
                                          firstSlashFound = true;
                                          continue;
                                   }
                   }
    
                  if( ch == '*' )
                 {
                          if( starCommentFound )
                          {
                                 endOfComment = true;
                                 continue;
                          }

                           if( firstSlashFound
                                              && starCommentFound == false )
                          {
                                   starCommentFound = true;
                                   firstSlashFound = false;
                                   continue;
                           }

                          else if( startOfComment == false
                                             && starCommentFound == true )
                           {
                                       startOfComment = true;
                                       continue;
                          }
               }

               if( ch == '\n' )
             {
                      if( slashCommentFound )
                      {
                             slashCommentFound = false;
                             startOfComment = false;
                             firstSlashFound = false;
                             starCommentFound = false;
                             System.out.print( ( char ) ch );
                             continue;
                        }
               }
    
               if( starCommentFound == true
                         && endOfComment == false )
                         continue;
    
                String doc = javaDoc.toString();
    
                 if(doc.trim().startsWith( "/**" ) && doc.trim().endsWith( "*/" ))
               {
                           System.out.print(javaDoc.toString());
                           javaDoc = new StringBuilder();
               }
    
               if( ch != '/' && ch != '*' )
               {
                         if( endOfComment )
                                System.out.print( ( char ) ch );
     
                         endOfComment = false;
                         firstSlashFound = false;
                         startOfComment = false;
                         endOfComment = false;
               }

                 if( slashCommentFound == false
                        && starCommentFound == false )
                 {
                           javaDoc = new StringBuilder();
                           System.out.print( ( char ) ch );
                 }
      }

       reader.close();

       }
      catch( FileNotFoundException ex )
      {
              System.out.println( fileName + " not found" );
       }
      catch( Exception ex )
      {
               System.out.println( "Error reading file " + fileName );
               ex.printStackTrace();
       }
 }

   public static void main( String[] args )
 {
	   RemoveComments2 reader = new RemoveComments2();
       reader.removeComments( "test.txt" );
 }
}
