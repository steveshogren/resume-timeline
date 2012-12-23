
$(function (){
    var skills = ["C#", "xUnit frameworks", "Ruby", "Java/Android", "TDD", "Pair-programming", "Agile",],
    job_info = [
        {
            title: "Software Developer",
            company: "AWE",
            location: "March 2011 - July 2012",
            summary: ["Assumed complete responsibility for, tested, and completed an unfinished legacy system for bi-directional data synchronization and statistics collection between independent kiosks with inconsistent Internet connectivity and unreliable date/time information in VB.NET and C#. Learned to maintain and repair several legacy versioned SOAP web services that had to be carefully dealt with due to a assortment of out-of-date kiosks in the field. Setup an internal wiki and helped maintain its Linux server. Motivated the team to setup and later helped to configure the CC.NET site for our CI server. ",
                      "Developed an authorization system, allowing customers to easily restrict certain areas of kiosk management using basic default profiles or to generate a completely customized solution. Assisted with migrating kiosk code base from using Access to Mysql, and from Windows XP to Windows 7. Leveraged python to script out small maintenance tasks. ",
                      "Between bigger projects, worked on front-end Flash and Actionscript development for kid's game stations, started a reading discussion around books including Peopleware and G.O.O.S, and organized better quality improvement measures for training peers in testing, pairing, and effective code review. Paired with a junior developer, teaching him how to use automated tests to fix defects in an otherwise unmaintainable C# site for manually uploading usage statistics. Assisted another junior developer in reviving a PHP site and guided him through learning general web programming using javascript and jQuery. "],
        },
        {
            title: "Software Developer",
            company: "ReminderMedia",
            location: "October 2009 - March 2011",
            summary: ["Developed clean code using test-driven design while striving for pragmatically high code coverage in PHP using phpunit. Trained three new developers through pair programming and self-designed evaluation documentation. Revised interview process, authoring a partially completed project for candidates to complete before the interview, giving them time to do their best and show more then just the typical “fizzbuzz”. Implemented “two pairs of eyes per line” code review practices with all team members using Kiln.",
                      "Refactored an authorization and authentication module for our external site using modern security practices and methods. Remodeled legacy systems by: bringing them under test, refactoring for clarity, and breaking apart where needed to better meet the underlying core domain model. Pair programmed a team management module for our customer service department that tripled conversion speed. Partnered with another developer in testing and rewriting the core business printing module, which is still responsible for composing and printing hundreds of thousands of uniquely customized magazines every week. ",
                      "Made architecture changes allowing our tests to be written with active record fakes by modifying our real active record entities to use injected state, reducing total test run time significantly. Sought out faster ways to run integration tests by converting the database to utilize a transactional setup, reducing test load times by a second each."],
        },
    ],
    makeJobToHtml = function(job) {
        return "<h5>" + job.title + " <span class=\"muted\">" + job.company + " - " + job.location + "</span></h5><p>" + job.summary.join("</p><p>") + "</p>";
    };
    $("#xp").html($.map(job_info, makeJobToHtml).join(' ')); 
    $("#skills").html('<a class="active">' + skills.join('</a> <a class="active">')); 
});