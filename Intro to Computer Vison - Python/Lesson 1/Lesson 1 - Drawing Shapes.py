import cv2
import numpy as np

# Creating a black image (700*700)
image = np.zeros((700, 700, 3))

# Drawing a circle
cv2.circle(image, (300, 300), 20, (255, 0, 0), 3)

#Drawing a rectangle
cv2.rectangle(image, (200, 5), (400, 120), (0, 0, 255), 10)

# Drawing a line
cv2.line(image, (400, 300), (500, 400), (0, 0, 255), 20)

# Adding text
cv2.putText(image, "Hello World!", (200, 100), fontFace=cv2.FONT_HERSHEY_COMPLEX, fontScale=1, color=(0, 0, 255))

#Adding ellipse: BONUS
cv2.ellipse(image, (500, 500), (100, 150), 0, 0, 180, 255, -1)

# Save the image as `MyImage.png`
cv2.imwrite('MyImage.png', image)

cv2.imshow('Image', image)

cv2.waitKey()
cv2.destroyAllWindows()

