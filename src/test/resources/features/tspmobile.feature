Feature: truesalesmrs functionality testing by mobile automation

  @mobile
  Scenario: Verify user login functionality
    Given Click on application icon, it should be opened
    When Enter mobile number "9840928052"
    And Click on Send OTP button
    Then OTP should be appeared "152535"
    And Click on verify button

  @DCR
  Scenario: Verify the user daily call functionality
    Given Click on Change Date Button
    Then Select Day to mark attendance pop-up window  should be appeared
    And Click on mark day option icon
    And Click on open button
    And Click on Start My Day button
    Then Mark Your Attendance pop-up window should be appeared
    And Click on Calander icon
    And Click on ok Calander ok button
    And Click on Choose Twon drop down button
    And Click on Start My Day Town Name Option
    And Click on Submit Button
    #And Click on View Agenda button
    Then Day Planner page should be displayed
    And Click on Field work + icon
    And Click on Search Tab
    And Click on the Doctor name Section
    And Click on Save Button
    And Click on NCA tab
    And Click on NCA+ icon
    Then Select Non Call Activity Pop-up window should be displayed
    And Click on DF Meet Mark Button
    Then Select Town pop-up window should be displayed
    And Click on Agra Mark Town Button
    And Click on Report NCA Button
    Then Report NCA pop-up window should be displayed
    And Click on NCA Shift drop down button
    And Select Full Day Function Name
    And Enter the "Aaa" name in the Comment textbox
    And Click on NCA Submit Button
    Then Day planner page should be displayed with Field work addition
    And Click again Field work tab
    And Click on Doctor Profile Name
    Then Should Displayed the Dr. 360 view
    And Click on Start DCR Button
    And Click on Next button
    And Click on SGPI Input button of EY CHEMIST BOTTLE JAN
    And Click on SGPI next button
    And Click on servey page of Next  button
    And Click On Input Fucntion
    Then Should displayed the given inputs name
    And Click on Survey function
    Then Should Displayed the survey page
    And Click on Submit DCR Button
    Then Should Displayed The submit DCR Confimation Pop-up window
    And Click on Yes Button
    And Click on back Arrow button
    And Click on Back Arrow button on Day Planner Page
    And Click on side bar button
    Then Should Displayyed the Side Page
    And Click on Master Sync function name
    Then Should Displayed Master sync loading Bar
    And Click on End My Day Button
    Then Should displayed the mark your attendace pop-up window for ending day
    And Click on Calander icon to Adjust Time
    And Click on clock Hour Hand
    And Click on pm function
    And Click on OK Calander on button
    And Click on Choose Town Button to end Day
    And Click on AAA Name
    And Click On Submit button to end day
    Then Should Displayed the Dashboard Page

  @MobileLeave
  Scenario: Verify the user leave functionality
    Given Click on leave icon
    Then Should be  displayed the leave Requests page
    And Click on My Leave DashBoard Button
    Then Should be Displayed Leave Management page
    And Click on Apply Leave Button
    Then Should be displayed the apply leave side page
    And Click On From date Calander icon
    And Click On from From Date ok button
    And Click On from date
    And Click On To date Calander icon
    And Click on To date ok button
    And Click on To date
    And Click on Leave type drop down button
    And Click on leave without pay option
    And Click on Enter Reamrk Tab
    And Enter Test type in the remark tab
    And Click on Submit Button
    And Click on Yearly Button
    And Click on Current month option
    And Click On View Button
    And Click on Cross icon
    And Click on Back Arrow of leave Management
    And Click on view button of Dheeraj Kumar user
    And Click on user leave view button
    And Click on Accept Request Button
    And Click on User Approved view button
    And Click on Cancel Leave Button
    Then Should be displayed cancellation pop-up window
    And Click on Blanck Tab
    And Enter 1 Testing type in the reamrk tab
    And Click on Cancel Leave button of pop-up
    Then Should displayed the Leave Management page
    And Click on other user view button
    Then Should displayed the side page of user leave
    And Click on Reject Request Button
    Then Should displayed the Rejection Reason pop-up window
    And Click on Remark Tab
    And Enter 2 Testto type in the reamrk tab
    And Click on Rejection Reason on Reject Request button

  @MobileExpense
  Scenario: Verify the user Expense functionality
    Given Click on Expense icon
    Then Should display the expense page
    And Click on Name drop down button
    And Click on "My-self" option
    And Click on "Jan-2024" bar chart
    Then Should displayed the "jan-2024" Expense list
    And Click on Check Box
    And Click on Submit Expenses button
    Then Should Displayed Same Page
    And Click on user Drop Down Button to Select Employee name
    And Click On Employee name "Arpan Bezbaruah"
    And Click on Employee expense Bar chart of "Jan-2024"
    And Click on Expense list Check Box
    And Click on Expense list view button
    Then Should displayed the Employee same date page
    And Click on View DAR Report
    And Click on DRA activity report cross button
    And Click on Edit TA Button
    Then Should displayed the Approved amount pop-up window
    And Click on Amount Tab
    And Enter the amount "444"
    And Click On Enter note Tab
    And Enter note "Test"
    And Click on Submit Button
    Then Should Displayed the Amount Edited Message
    And Click on Details Button
    Then Should displayed the Add Receipt button
    And Click on Add Receipt button
    Then Should Displayed the Camera and Gallery pop-up
    And Click on Camera option
    Then Should open camera
    And click on Camera Capture button
    And Click on OK button
    Then Should dispalyed the pop-up window with image
    And Click on Enter Amount Button of Pop-up window
    And Click on Enter Description of pop-up window
    And Click on  Window Submit button
    And Click on Edit button of attachment details
    Then Should displayed the same attachment for editing
    And Click on Amount tab For editing the amount
    And Click on Submit button of editing
    And Click on Delete button
    Then Should Displayed the Delete Expnese Pop-up Window
    And Click on Delete Pop-up Yes button
    And Click on Add New Expense button
    Then Should displayed the Add more expenses pop-up window
    And Click on Own Stay Check box
    And Click on  Plus Add Button
    Then Should Displayed the Employee 360 view page of expense
    And Click on Back arrow button of Employee 360 view page
    Then Should Displayed the Expense page of back time
    And Click Back Arrow of expanse page of last to returen dashboard page
    Then Should Displayed the Home page of application

  @MobileInputInventory
  Scenario: Verify the user Input Inventory  functionality
    Given Click on Input Inventory icon
    Then Should be displayed the Input Inventory page
    And Click on Drop Down button
    And Click on MD SHAHNAWAZ IMAM Name option
    And Click on Search Tab
    And Enter the input Name "EY RESYNC BP MONITOR"
    And Click on the input check box
    Then Should displayed the Action button on hilighted form
    And Enter the input number
    And Click on Transfer Input button
    Then should Displayed the Transfer Input pop-up window
    And Click on the Select drop down button
    And Click on the Any Employee name "Dheeraj Kumar"
    And Click on the Remark tab
    And Enter the any remark name "Test"
    And Click on the Submit Button
    Then Should Displayed the Thanku You pop-up message window
    And Click on the Thank You Button
    Then Should Displayed The Dashboard page
    And Click on View Agenda Button
    And Click on Doctor profile Name
    Then Should Diplayed the Doctor 360 view
    And Click on Start DCR Button
    Then Should Displayed the Brand Page
    And Click on Next Button
    And Check the Transfer Inputs balance same shows in the Input Inventory Tab

  @MobileMTP
  Scenario: Verify the Employee MTP functionality
    Given Click on MTP Icon
    Then Should Displayed the MTP Page
    And Click on Month Drop Down Button
    And Click on Feb month option
    And Click on Create New MTP button
    And Click on February Month Draft Sction
    And Click on Plan button
    And Click on select drop down button
    And Click on FW option
    And Click on Territory Select drop down button
    And Click on Meerut 2 ABHINAV Option
    And Click on Patch select drop down button
    And Click on Dhampur option
    And Click on customer check box Button
    And Click on Save Data button
    Then Should be displayed the FW Data on same page
    And Click on Activity drop down
    And Click on JW option
    And Click on Meerut 1 Mohd Sadik
    And Click On NCA option
    And Click on NCA Types Drop down button
    And Click on Transit
    And Click On Town Select Drop down Button
    And Click on Adalhat option
    And Click on Click On Save Button Of NCA
    Then Should Be displayed the NCA Data
    And Click on Reset button
    Then Should displayed the empaty plan MTP Page
    And Click on back arrow button
    Then Should Displayed the Monthly Tour Plan Page
    And Click on Submit MTP Button
    Then Should Displayed the MTP page with requested and Draft MTPs Are visible
    And Click on Requested MTP Section
    Then Should Displayed the mtp page with Reject option and Approved option
    And Click on Approved option
    Then should dispalyed the approved MTP page
    And Click on Reject button
    Then Should displayed the MTP page With Reject option

  @MobileCustomers
  Scenario: Verify the customers module functinalty
    Given Click on customers module icon
    Then Should displayed the Customers page
    And Click on filter icon
    Then Should displayed the filter by pop-up window
    And Click on Doctor name check box
    And Click on Speciality Check box "GEN OPTHAL"
    And Click on Patch check box "Cuttack1"
    And Click on Apply button
    Then Should displayed the selected path and Speciality Doctors list
    And Click on Search box
    And Enter the Doctor name "Dr.Smruti Panda"
    Then Should Displayed the Doctor  profile
    And Click on Doctor Profile 
    Then Should Displayed the same customer page 
    And Click on back arrow button of doctor profile
    Then Should displayed the Dashboard
